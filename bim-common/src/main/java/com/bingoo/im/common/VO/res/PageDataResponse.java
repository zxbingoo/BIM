package com.bingoo.im.common.VO.res;

public class PageDataResponse<T> extends DataResponse<T> {
    private int total;

    public PageDataResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public PageDataResponse<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public PageDataResponse<T> setInfo(String info) {
        this.info = info;
        return this;
    }

}
