package com.graduation.smart_site_inspection_system.Bean;

import androidx.annotation.Nullable;

public class GroupBean {
    int id;
    String name;
    boolean isLeader;

    public GroupBean(int id,String name,boolean isLeader){
        this.id=id;
        this.name=name;
        this.isLeader=isLeader;
    }
    @Override
    public int hashCode() {
        return Integer.valueOf(this.id).hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(obj==null)return false;
        return ((GroupBean)obj).id==this.id;
    }
}