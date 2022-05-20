package org.wz.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 20:14:34
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

