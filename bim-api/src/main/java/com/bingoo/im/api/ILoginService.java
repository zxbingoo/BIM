package com.bingoo.im.api;

import com.bingoo.im.common.BO.UserInfo;

/**
 * @author jianbin
 * @date 2019/11/27
 */
public interface ILoginService {
    Boolean check(UserInfo userInfo);
}
