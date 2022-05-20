package org.wz.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wz.gulimail.common.utils.PageUtils;
import org.wz.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wz
 * @email 1611835174@qq.com
 * @date 2022-05-15 20:53:52
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

