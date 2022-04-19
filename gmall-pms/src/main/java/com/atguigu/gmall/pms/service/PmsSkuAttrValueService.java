package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.PmsSkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2022-03-29 09:49:04
 */
public interface PmsSkuAttrValueService extends IService<PmsSkuAttrValueEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

