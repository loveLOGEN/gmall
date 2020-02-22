package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fanyudong
 * @email 1300141550@qq.com
 * @date 2020-02-19 15:47:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
