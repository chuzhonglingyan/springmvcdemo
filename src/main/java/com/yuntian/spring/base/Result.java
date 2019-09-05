package com.yuntian.spring.base;

/**
 * @Auther: yuntian
 * @Date: 2019/9/2 0002 23:05
 * @Description:
 */
public class Result {

    private String msg;

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
