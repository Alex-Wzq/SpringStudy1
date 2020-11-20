package com.wzq.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Parent {
    String name;
    @Autowired(required = false) // 自动装配，且可以为null，先byType后byName，一种整合
    Son son;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    @Override
    public String toString() {
        return "parent : " + name;
    }
}
