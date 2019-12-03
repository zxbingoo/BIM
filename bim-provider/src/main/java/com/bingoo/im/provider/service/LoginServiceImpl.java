package com.bingoo.im.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bingoo.im.api.ILoginService;
import com.bingoo.im.common.BO.UserInfo;
import com.bingoo.im.common.utils.Checker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jianbin
 * @date 2019/11/27
 */
@Component
@Service(interfaceClass = ILoginService.class)
public class LoginServiceImpl implements ILoginService {

    public static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    private static final Map<String, UserInfo> users = new HashMap();
    static {
        users.put(String.format("%s_%s", "bingoo", "123456"),
                new UserInfo().setUsername("bingoo").setPassword("123456").setUserId(1));
        users.put(String.format("%s_%s", "root", "123456"),
                new UserInfo().setUsername("root").setPassword("123456").setUserId(2));
    }

    @Override
    public Boolean check(UserInfo userInfo) {
        return Checker.isNone(users.get(String.format("%s_%s", userInfo.getUsername(), userInfo.getPassword())));
    }
}
