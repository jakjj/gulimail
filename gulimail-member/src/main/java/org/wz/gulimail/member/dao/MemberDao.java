package org.wz.gulimail.member.dao;

import org.wz.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 20:53:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
