package com.login;

public class resModel {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void success(String msg) {
        this.code = "success";
        this.message = msg;
    }

    public void error(String msg) {
        this.code = "error";
        this.message = msg;
    }

}
