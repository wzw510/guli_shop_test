package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2022-03-29 09:49:03
 */
@Mapper
public interface PmsCategoryMapper extends BaseMapper<PmsCategoryEntity> {
	
}
