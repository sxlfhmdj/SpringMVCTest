package com.dj.rest.example.dto;

/**
 * <p>Description: [DemoDto]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017/12/26
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */
public class DemoDto {
    private String name = "名字";
    private String company = "公司";
    private String address = "地址";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
