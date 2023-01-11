package com.example.testDataBase.services;

import com.example.testDataBase.classes.MyTemp;
import com.example.testDataBase.classes.TempListClass;
import com.example.testDataBase.classes.TestComponent1;
import com.example.testDataBase.entity.TempEntity;
import com.example.testDataBase.repository.TempEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TempEntityService {
    @Autowired
    private TempEntityRepo tempEntityRepo;
    @Autowired
    private String param1;
    @Autowired
    private TestComponent1 testComponent1;

    public TempEntity addTempEntity(TempEntity tempEntity) {
        System.out.println("service=" + param1);
        System.out.println(testComponent1.getStr1());
        TempListClass tempListClass = new TempListClass();
        List<MyTemp> myTempList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            MyTemp myTemp = new MyTemp();
            myTemp.setDolg("dddddddd"+i);
            myTemp.setName("nnnnnnnn"+i);
            myTemp.setPodr("pppppppp"+i);
            myTemp.setNum(i);
            myTempList.add(myTemp);
        }
        tempListClass.setMyTempList(myTempList);
        tempEntity.setTempListClass(tempListClass);
        return tempEntityRepo.save(tempEntity);
    }

    public List<TempEntity> getAllTemp() {
        List<TempEntity> tempEntities = new ArrayList<>();
        tempEntityRepo.findAll().forEach(te -> {
            tempEntities.add(te);
        });
        return tempEntities;
    }

    public TempEntity getByd1(Date d1) {
        return tempEntityRepo.findByD1(d1);
    }
}
