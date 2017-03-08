package com.chuliafeng.elasticjobtest.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
@Entity
public class Foo {
    @Id
    @GeneratedValue
    private  long id;

    private  String location;

    private  int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{id:"+getId()+",location:"+getLocation()+",status:"+getStatus()+"}";
    }
}
