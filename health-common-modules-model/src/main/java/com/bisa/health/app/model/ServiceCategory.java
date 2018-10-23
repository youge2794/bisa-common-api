package com.bisa.health.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "e_service_category")
public class ServiceCategory {
    private int id;
    private String stoken;
    private String name;
    private String desc;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoken() {
        return stoken;
    }

    public void setStoken(String stoken) {
        this.stoken = stoken;
    }

    @Column(name = "sname")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sdesc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ServiceCategory() {
        super();
    }

    @Override
    public String toString() {
        return "ServiceCategory{" +
                "id=" + id +
                ", stoken='" + stoken + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static ServiceCategory byCategory(List<ServiceCategory> list, String stoken) {
        for (ServiceCategory serviceCategory : list) {
            if (stoken.equals(serviceCategory.getStoken())) {
                return serviceCategory;
            }
        }
        return null;
    }

}
