package com.zpy.validtest.globalexception;

import lombok.Data;

@Data
public class ErrorBody {

    private Integer code;
    private String message;
    private long timestamp = System.currentTimeMillis();

    public ErrorBody(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
