package com.example.testDataBase.classes;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


public class TempListClass implements Serializable {
    private List<MyTemp> myTempList;

    public TempListClass() {
    }

    public List<MyTemp> getMyTempList() {
        return myTempList;
    }

    public void setMyTempList(List<MyTemp> myTempList) {
        this.myTempList = myTempList;
    }
}
