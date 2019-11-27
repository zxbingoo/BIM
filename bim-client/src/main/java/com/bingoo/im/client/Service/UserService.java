package com.bingoo.im.client.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingoo.im.api.ILoginService;
import com.bingoo.im.common.BO.UserInfo;
import com.bingoo.im.common.VO.res.BaseResponse;
import org.springframework.stereotype.Service;

/**
 * @author jianbin
 * @date 2019/11/27
 */
@Service
public class UserService {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private ILoginService loginService;

    public BaseResponse login(UserInfo userInfo) {
        if(!loginService.check(userInfo)){
            BaseResponse.fail(BaseResponse.PARAMETER_ERROR, "用户不存在");
        }
//        loginService.connetToServer(userInfo);
        return null;
    }
}
