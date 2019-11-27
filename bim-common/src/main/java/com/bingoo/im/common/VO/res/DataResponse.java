package com.bingoo.im.common.VO.res;

public class DataResponse<T> extends BaseResponse {
    protected T data;

    public T getData() {
        return data;
    }

    public DataResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public DataResponse<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public DataResponse<T> setInfo(String info) {
        this.info = info;
        return this;
    }

    public static <T> DataResponse<T> success(T data) {
        return new DataResponse().setData(data);
    }
}
