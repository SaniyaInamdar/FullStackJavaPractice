package com.jbk.mappingex;

import javax.persistence.*;

@Entity
public class ShopLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locId;

    private String location;

    @ManyToOne
    @JoinColumn(name = "mobile_id")   // FK column
    private Mobile mobile;

    public ShopLocation() {
    }

    public ShopLocation(String location) {
        this.location = location;
    }

    public int getLocId() {
        return locId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "ShopLocation [locId=" + locId + ", location=" + location + "]";
    }
}