package org.wz.gulimail.coupon.dao;

import org.wz.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 16:45:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
