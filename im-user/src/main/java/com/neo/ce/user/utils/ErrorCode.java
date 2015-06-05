package com.neo.ce.user.utils;

import lombok.Data;

/**
 * Created by neowyp on 2015/6/5.
 */
public enum ErrorCode {
    ECODE_DB_ERROR("DB ERROR", "1"),
    ECODE_DB_ERROR1("DB ERROR", "2"),
    ECODE_DB_ERROR2("DB ERROR", "3");
    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    ErrorCode(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String toString() {
        return "{code:" + this.code + ", msg:" + this.msg + "}";
    }

    public static void main(String[] args) {
        System.out.println(ErrorCode.ECODE_DB_ERROR1.toString());
        System.out.println(ECODE_DB_ERROR.getCode());
    }
}
