package org.wz.gulimail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.common.utils.Query;

import org.wz.gulimail.product.dao.CategoryDao;
import org.wz.gulimail.product.entity.CategoryEntity;
import org.wz.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {



    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> collect = categoryEntities.stream()
                .filter(item -> item.getParentCid() == 0)
                .peek(item->{
                    item.setChildren(getChildren(item, categoryEntities));
                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
        return collect;
    }

    /**
     * 获取子节点
     * @param root
     * @param datas
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> datas){

        Long catId = root.getCatId();
        return datas.stream()
                .filter(item -> {
                    return catId.equals(item.getParentCid());
                })
                .peek(item -> item.setChildren(getChildren(item, datas)))
                .sorted(Comparator.comparing(item->item.getSort()==null?null:item.getSort().toString(), Comparator.nullsFirst(String::compareTo)))
                .collect(Collectors.toList());

    }

    @Override
    public void removeMenuByIds(List<Long> catIds) {

        baseMapper.deleteBatchIds(catIds);
    }
}