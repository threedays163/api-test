package com.huatu.paike.api_test.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.huatu.common.dto.resp.Node;
import com.huatu.paike.api_test.service.NodeService;
import com.huatu.paike.api_test.utils.LoginUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
@Slf4j
public abstract class AbstractNodeService implements NodeService {

    public final static Long NODE_KEY_KEY_PERIOD = 30 * 60l;// 组织架构缓存有效时长，30分钟

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private Object getRedisValue(String key) {
        ValueOperations<String, Object> valueops = redisTemplate.opsForValue();
        Object value = valueops.get(key);
        return value;
    }

    public void setRedisValue(String key, Object value, long timeout) {
        if (StringUtils.isBlank(key)) {
            return;
        }
        ValueOperations<String, Object> valueops = redisTemplate.opsForValue();
        valueops.set(key, value, timeout, TimeUnit.SECONDS);
    }

    private static Map<Long, Node> nodeMap = Maps.newHashMap();

    private static String flag = StringUtils.EMPTY;

    @Value("${spring.redis.key.prefix}")
    private String redisKeyPrefix;

    @Value("${spring.redis.key.allNodes}")
    private String cache_key;

    /**
     * 获取数据库中对应的全部组织架构信息
     * 
     * @return
     */
    protected abstract List<Node> getAllNodeFromDb();

    @Override
    public Map<Long, Node> getNodeMap() {
        String key = redisKeyPrefix + cache_key;
        Object cacheFlag = getRedisValue(key);
        if (cacheFlag == null) {
            synchronized (flag) {// 并发控制
                if (cacheFlag == null) {
                    log.info("初始化缓存标志");
                    String newFlag = UUID.randomUUID().toString();
                    setRedisValue(key, newFlag, NODE_KEY_KEY_PERIOD);
                    cacheFlag = newFlag;
                }
            }
        }
        if (!flag.equals(cacheFlag)) {// 缓存非最新
            synchronized (flag) {// 并发控制
                flag = String.valueOf(cacheFlag);
                log.info("更新缓存");
                List<Node> nodes = getAllNodeFromDb();
                nodeMap.putAll(Node.buildNodeMap(nodes));
            }
        }
        return nodeMap;
    }

    @Override
    public Node getNode(Long nodeId) {
        Map<Long, Node> nodeMap = getNodeMap();
        return nodeMap.get(nodeId);
    }

    @Override
    public Node getNodeWithoutChildren(Long nodeId) {
        Map<Long, Node> nodeMap = getNodeMap();
        return Node.getNodeWithoutChildren(nodeId, nodeMap);
    }

    @Override
    public void clearCache() {
        log.info("清理组织架构缓存");
        String key = redisKeyPrefix + cache_key;
        String newFlag = UUID.randomUUID().toString();
        setRedisValue(key, newFlag, NODE_KEY_KEY_PERIOD);
    }

    @Override
    public Set<Long> getPosterityIds(Long nodeId) {
        Map<Long, Node> nodeMap = getNodeMap();
        return Node.getPosterityIds(nodeId, nodeMap);
    }

    @Override
    public Set<Long> getPosterityIds(Collection<Long> nodeIds) {
        if (CollectionUtils.isEmpty(nodeIds)) {
            return Collections.emptySet();
        } else {
            return nodeIds.stream().map(this::getPosterityIds).flatMap(Collection::stream).collect(Collectors.toSet());
        }
    }

    @Override
    public Set<Long> getIntersectPosterityIds(Collection<Long> leftNodeIds, Collection<Long> rightNodeIds) {
        if (CollectionUtils.isEmpty(leftNodeIds) || CollectionUtils.isEmpty(rightNodeIds)) {
            return Collections.emptySet();
        } else {
            Set<Long> posterityIdsOfLeft = getPosterityIds(leftNodeIds);
            Set<Long> posterityIdsOfRight = getPosterityIds(rightNodeIds);

            return Sets.newHashSet(CollectionUtils.intersection(posterityIdsOfLeft, posterityIdsOfRight));
        }
    }

    @Override
    public List<String> getFullNodeIdsList(List<Long> ids) {
        Map<Long, Node> nodeMap = getNodeMap();
        return Node.getFullNodeIdsList(ids, nodeMap);
    }

    @Override
    public boolean isPosterity(Long id, List<Long> ids) {
        Map<Long, Node> nodeMap = getNodeMap();
        return Node.isPosterity(id, ids, nodeMap);
    }

    @Override
    public List<Node> children(Long nodeId) {
        List<Node> result = Lists.newArrayList();
        Map<Long, Node> map = getNodeMap();
        for (Node node : map.values()) {
            if (node.getPid().equals(nodeId)) {
                result.add(node);
            }
        }
        return result;
    }

    @Override
    public Set<Long> getPosterityIdsForQueryParam(Long nodeId){
        if(nodeId == null){
            List<Long> nodeIds = LoginUtils.getCurrentUser().getNodeIds();
            if(nodeIds.contains(1L)){
                return null;
            }else{
                return Sets.newHashSet(nodeIds);
            }
        }else if( nodeId == 1L){
            //总部的条件作废掉，返回空，查询条件需做非空判断
            return null;
        }else{
            Map<Long, Node> nodeMap = getNodeMap();
            return Node.getPosterityIds(nodeId, nodeMap);
        }
    }

    @Override
    public Set<Long> getPosterityIdsForQueryParam(Collection<Long> nodeIds){
        if (CollectionUtils.isEmpty(nodeIds)) {
            return Collections.emptySet();
        } else if(nodeIds.contains(1L)){
            //总部权限，返回空
            return null;
        } else {
            return nodeIds.stream().map(this::getPosterityIds).flatMap(Collection::stream).collect(Collectors.toSet());
        }
    }

}
