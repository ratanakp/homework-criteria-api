package com.example.homework02criteriaapi.entities;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

    private String street;
    private String houseNo;
    private String province;
    private String country;

    public Address() {
    }

    public Address(String street, String houseNo, String province, String country) {
        this.street = street;
        this.houseNo = houseNo;
        this.province = province;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
