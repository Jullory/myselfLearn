package com.learn.mall.service;

import com.learn.mall.common.api.CommonResponse;

/**
 * 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResponse generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResponse verifyAuthCode(String telephone, String authCode);
}
