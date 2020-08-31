package com.zln.springbootswagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User {
    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户地址")
    private String address;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
