package com.bingoo.im.common.VO.res;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    public static final int SUCCEED = 0;//成功
    public static final int PARAMETER_ERROR = 1;//参数错误
    public static final int APP_ERROR = 2;//应用级别错误
    public static final int APP_EXCEPTION = 3;//应用级别异常
    public static final int NO_RIGHT = 4;//不合法的权限
    public static final int OTHER_ERROR = 5;//其他错误

    protected int code;
    protected String info;

    public BaseResponse(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public BaseResponse() {
    }

    public int getCode() {
        return code;
    }

    public BaseResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public BaseResponse setInfo(String info) {
        this.info = info;
        return this;
    }

    public static BaseResponse success() {
        return new BaseResponse();
    }

    public static BaseResponse fail(int code, String msg) {
        return new BaseResponse(code, msg);
    }


}
