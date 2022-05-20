package org.wz.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 20:27:00
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

