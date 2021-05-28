package com.tasion.userserver.util;

import java.io.Serializable;

public class Result<T> implements Serializable {
    public static final int successCode = 200;
    public static final int errorCode = 400;
    private static final long serialVersionUID = 1L;
    //("成功标识")
    private boolean success = true;
    //("返回消息")
    private String message = "";
    //("返回代码")
    private Integer code;
    //("时间戳")
    private long timestamp;
    //("数据对象")
    private T result;

    public Result<T> success(String message, T result) {
        this.success(message);
        this.result = result;
        return this;
    }
    public Result<T> success(String message) {
        this.message = message;
        this.code = CommonConstant.SC_OK_200;
        this.success = true;
        return this;
    }

    public Result() {
        this.code = CommonConstant.SC_OK_200;
        this.timestamp = System.currentTimeMillis();
    }
    private Result(int code, String mesg, T data) {
        this.code = CommonConstant.SC_OK_200;
        this.timestamp = System.currentTimeMillis();
        this.code = code;
        this.message = mesg;
        this.result = data;
    }

    public static int getSuccessCode() {
        return successCode;
    }

    public static int getErrorCode() {
        return errorCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
