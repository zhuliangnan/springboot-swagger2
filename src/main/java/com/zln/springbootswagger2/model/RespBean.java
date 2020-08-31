package com.zln.springbootswagger2.model;

import java.util.List;

public class RespBean {

    private Integer Code ;
    private List<?> data;

    public Integer getCode() {
        return Code;
    }

    public List<?> getData() {
        return data;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public RespBean(Integer code, List<?> data) {
        Code = code;
        this.data = data;
    }
}
