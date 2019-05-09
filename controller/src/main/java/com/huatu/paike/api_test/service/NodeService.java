package com.huatu.paike.api_test.service;

import com.huatu.common.dto.resp.Node;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface NodeService {

	Map<Long, Node> getNodeMap();

	/**
	 * 获取节点信息
	 *
	 * @param nodeId
	 * @return
	 */
	Node getNode(Long nodeId);

	/**
	 * 获取子节点
	 *
	 * @param nodeId
	 * @return
	 */
	List<Node> children(Long nodeId);

	/**
	 * 获取节点信息
	 *
	 * @param nodeId
	 * @return
	 */
	Node getNodeWithoutChildren(Long nodeId);

	/**
	 * 获取后代节点信息
	 *
	 * @param nodeId
	 * @return
	 */
	Set<Long> getPosterityIds(Long nodeId);

	Set<Long> getPosterityIds(Collection<Long> nodeIds);

	/**
	 * @param leftNodeId
	 *            需要求子节点交差的左节点列表
	 * @param rightNodeIds
	 *            需要求子节点交差的右节点列表
	 * @return 两操作节点列表对应的子节点列表的交集
	 */
	Set<Long> getIntersectPosterityIds(Collection<Long> leftNodeId, Collection<Long> rightNodeIds);

	List<String> getFullNodeIdsList(List<Long> ids);

	boolean isPosterity(Long id, List<Long> ids);

	/**
	 * 清理缓存
	 */
	void clearCache();

	/**
	 * 获取nodeId下属的权限节点，为查询的数据权限所用
	 * 如果是总部的返回为null， 查询条件将此条件作废调
	 * @param nodeId
	 * @return
	 */
	Set<Long> getPosterityIdsForQueryParam(Long nodeId);

	/**
	 * 获取nodeId下属的权限节点，为查询的数据权限所用
	 * 如果是总部的返回为null， 查询条件将此条件作废调
	 * @param nodeIds
	 * @return
	 */
	Set<Long> getPosterityIdsForQueryParam(Collection<Long> nodeIds);

}
