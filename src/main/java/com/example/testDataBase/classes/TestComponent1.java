package com.example.testDataBase.classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Component
//@Scope("prototype")
public class TestComponent1 {
    public List<TestForJackson> employeeList;
    public TestComponent1() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        URL url=new URL("http://localhost/teltest.nsf/p_rest1.xsp/recv");
        employeeList = objectMapper.readValue(url,new TypeReference<>(){} );

       // System.out.println(employeeList);
        System.out.println("init TestComponent1");
    }
    public String getStr1(){
        return "hello component1 "+this.toString();
    }

    @Override
    public String toString() {
        return "TestComponent1{}";
    }
}
