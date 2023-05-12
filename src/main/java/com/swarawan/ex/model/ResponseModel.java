package com.swarawan.ex.model;

public class ResponseModel {

    private String status;
    private Object data;
    private String error;

    public ResponseModel(String status, Object data, String error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public String getError() {
        return error;
    }
}
