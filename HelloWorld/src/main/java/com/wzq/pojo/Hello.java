package com.wzq.pojo;

/**
 * @author wzq
 * @version 1.0
 * @since 1.5
 */
public class Hello {

    private String str;

    public String getStr(){
        return str;
    }

    @Deprecated
    public void setStr(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        setStr("1");
        return "Hello " + str + "!";
    }
}
