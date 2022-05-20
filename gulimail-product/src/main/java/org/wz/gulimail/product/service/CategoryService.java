package org.wz.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-14 17:32:33
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> catIds);
}

