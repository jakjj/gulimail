package org.wz.gulimail.product.dao;

import org.wz.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-14 17:32:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
