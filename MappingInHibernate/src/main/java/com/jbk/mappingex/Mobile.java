package com.jbk.mappingex;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MobId;

    private String brandname;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ShopLocation> shopLocations = new ArrayList<>();

    public Mobile() {
    }

    public Mobile(String brandname) {
        this.brandname = brandname;
    }

    public int getMobId() {
        return MobId;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public List<ShopLocation> getShopLocations() {
        return shopLocations;
    }

    public void addShopLocation(ShopLocation location) {
        shopLocations.add(location);
        location.setMobile(this);   // maintain both sides
    }

    @Override
    public String toString() {
        return "Mobile [MobId=" + MobId + ", brandname=" + brandname + "]";
    }
}
