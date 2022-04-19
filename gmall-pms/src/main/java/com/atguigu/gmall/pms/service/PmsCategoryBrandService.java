package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.PmsCategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2022-03-29 09:49:04
 */
public interface PmsCategoryBrandService extends IService<PmsCategoryBrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

