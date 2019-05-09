
package com.huatu.paike.api_test.utils;

import com.huatu.cas.context.AccessControlContext;
import com.huatu.cas.dto.AccountDto;
import com.huatu.common.annotation.LoginNeedless;
import com.huatu.common.cache.CacheClient;
import com.huatu.common.utils.AES;
import com.huatu.paike.api_test.dto.BaseLoginUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Slf4j
public class LoginUtils {

    public static final ThreadLocal<BaseLoginUser> currentUser = new InheritableThreadLocal<BaseLoginUser>();

    public static void setCurrentUser(BaseLoginUser user) {
        currentUser.set(user);
    }

    public static BaseLoginUser getCurrentUser() {
        BaseLoginUser loginUser = currentUser.get();
        // TODO 这里为了方便我的测试，我先写一个假数据，以后在删掉
         /*if(loginUser==null) {
         BaseLoginUser user = new BaseLoginUser();
         user.setStaffNo("A221123");
         user.setId(1L);
         loginUser = user;

         }*/
        return loginUser;
    }

    private static Object getRedisValue(RedisTemplate<String, Object> redisTemplate, String key) {
        ValueOperations<String, Object> valueops = redisTemplate.opsForValue();
        Object value = valueops.get(key);
        return value;
    }

    public static void setRedisValue(RedisTemplate<String, Object> redisTemplate, String key, Object value,
        long timeout) {
        if (StringUtils.isBlank(key)) {
            return;
        }
        ValueOperations<String, Object> valueops = redisTemplate.opsForValue();
        valueops.set(key, value, timeout, TimeUnit.SECONDS);
    }

    /**
     * 获取员工信息key
     * 
     * @param accountDto
     * @return
     * @throws Exception
     */
    private static String getUserInfoKey(AccountDto accountDto, String sysRedisPrefix) throws Exception {
        if (accountDto == null) {
            return null;
        }
        String key =
            AES.Encrypt(String.format(Conf.LOGIN_KEY, accountDto.getId(), accountDto.getStaffNo()), Conf.FRONT_AES_KEY);
        return sysRedisPrefix + AccessControlContext.getSessionCookie() + key;
    }

    public static void initCurrentUser(HttpServletRequest req, RedisTemplate<String, Object> redisTemplate,
        String sysRedisPrefix) throws Exception {
        String key = getUserInfoKey(AccessControlContext.getLoginAccount(), sysRedisPrefix);
        if (StringUtils.isNotBlank(key)) {
            Object user = getRedisValue(redisTemplate, key);
            if (user != null) {
                if (user instanceof BaseLoginUser) {
                    BaseLoginUser baseUser = (BaseLoginUser) user;
                    setCurrentUser(baseUser);
                    setRedisValue(redisTemplate, key, user, Conf.FRONT_SESSION_TIMEOUT);
                } else {
                    log.error("The user is not front system.");
                }
            }
        }
    }

    /**
     * 刷新用户登录缓存，直接传递新的BaseUser进来 同能同public static void refreshUserCache(HttpServletRequest req, Cache loginCache) 类似
     * 
     * @param req
     * @param defultCache
     * @param baseUser
     * @throws Exception
     */
    public static void refreshUserCache(HttpServletRequest req, CacheClient defultCache, BaseLoginUser baseUser,
        String sysRedisPrefix) throws Exception {
        String key = getUserInfoKey(AccessControlContext.getLoginAccount(), sysRedisPrefix);
        setCurrentUser(baseUser);
        defultCache.set(key, baseUser, Conf.FRONT_SESSION_TIMEOUT);
    }

    public static boolean hasLoginNeedless(Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return false;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Class<?> type = handlerMethod.getBeanType();

        // 判断是否需有loginNeedless标记
        LoginNeedless loginNeedless = type.getAnnotation(LoginNeedless.class);
        if (loginNeedless == null) {
            loginNeedless = type.getSuperclass().getAnnotation(LoginNeedless.class);
        }
        if (loginNeedless == null) {
            loginNeedless = handlerMethod.getMethodAnnotation(LoginNeedless.class);
        }
        return loginNeedless != null;
    }

}
