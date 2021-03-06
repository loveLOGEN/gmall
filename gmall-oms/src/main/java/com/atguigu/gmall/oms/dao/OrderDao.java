package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fanyudong
 * @email 1300141550@qq.com
 * @date 2020-02-19 15:43:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
