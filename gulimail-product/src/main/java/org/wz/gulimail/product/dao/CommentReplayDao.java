package org.wz.gulimail.product.dao;

import org.wz.gulimail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-14 17:32:33
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
