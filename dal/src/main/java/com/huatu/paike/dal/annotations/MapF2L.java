
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.dal.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @title MapF2L
 * @desc 将查询结果映射成map<key,List<value>>的注解，其中第一个字段为key，第二个字段为velue</br>
 *       注：返回类型必须为（{@link java.util.Map Map<K,List<V>>}）,K/V的类型通过 mybatis的TypeHander进行类型转换，如意欧必要可自定义TypeHander
 * @author shanyu
 * @date 2018年7月27日
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface MapF2L {

}
