package com.sds3.dsvendas.dto;

import com.sds3.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double sum;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.name = seller.getName();
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
