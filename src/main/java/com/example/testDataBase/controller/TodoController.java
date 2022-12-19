package com.example.testDataBase.controller;

import com.example.testDataBase.entity.TodoEntity;
import com.example.testDataBase.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity createTodo(@RequestBody TodoEntity todo, @RequestParam Long userid) {
        try {
            return ResponseEntity.ok(todoService.addTodo(todo, userid));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка сохранения todo");
        }
    }

}
