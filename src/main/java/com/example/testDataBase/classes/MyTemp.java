package com.example.testDataBase.classes;

import java.io.Serializable;

public class MyTemp implements Serializable {
    private String name;
    private String podr;
    private String dolg;
    private int num;

    public MyTemp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPodr() {
        return podr;
    }

    public void setPodr(String podr) {
        this.podr = podr;
    }

    public String getDolg() {
        return dolg;
    }

    public void setDolg(String dolg) {
        this.dolg = dolg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
