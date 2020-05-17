package com.east.sharding.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResponse<T> implements Serializable {

    private static final long serialVersionUID = -1547866547521L;

    private String code;

    private String msg;

    private String errMsg;

    private T data;

    public JsonResponse(){

    }

    private JsonResponse(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
