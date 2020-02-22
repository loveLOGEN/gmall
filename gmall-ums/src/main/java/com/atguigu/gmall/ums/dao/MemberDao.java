package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fanyudong
 * @email 1300141550@qq.com
 * @date 2020-02-19 15:50:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
