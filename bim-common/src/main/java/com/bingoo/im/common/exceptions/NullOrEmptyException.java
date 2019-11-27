package com.bingoo.im.common.exceptions;

public class NullOrEmptyException extends Exception {
    private String message = "";

    public NullOrEmptyException(){

    }
    public NullOrEmptyException(String msg){
        this.message = msg;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}