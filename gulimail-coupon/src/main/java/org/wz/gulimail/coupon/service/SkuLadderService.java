package org.wz.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 16:45:26
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

