package com.example.testDataBase.controller;

import com.example.testDataBase.classes.TestComponent1;
import com.example.testDataBase.entity.TempEntity;
import com.example.testDataBase.services.TempEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/temp")
public class TempEntityController {
    @Autowired
    private TempEntityService tempEntityService;
    @Autowired
    private TestComponent1 testComponent1;

    @PostMapping("/addTemp")
    public ResponseEntity addTemp(@RequestBody TempEntity tempEntity) {
        try {
            tempEntityService.addTempEntity(tempEntity);
            return ResponseEntity.ok("Ok. recored saved"+testComponent1.employeeList.toString());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка сохранения!");
        }
    }

    @GetMapping("/allTemp")
    public ResponseEntity getTemps() {
        try {
            return ResponseEntity.ok(tempEntityService.getAllTemp());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/byD1Temp")
    public ResponseEntity getByD1Temps(@RequestParam("d1") @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss") Date d1) {

        try {
            return ResponseEntity.ok(tempEntityService.getByd1(d1));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка:" + e.getMessage());
        }
    }

}
