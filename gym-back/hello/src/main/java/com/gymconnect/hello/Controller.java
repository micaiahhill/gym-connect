package com.gymconnect.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api") 

public class Controller {
    private final FirstFirst secondSecond;
    @Autowired
    public Controller(FirstFirst myService) {
        this.secondSecond = myService;
    }

    @PostMapping("/sql")
    public List<Map<String, Object>> executeSQLStatement(@RequestBody Map<String, String> statement) {
        return secondSecond.executeSql(statement.get("sql"));
    }

    @GetMapping("/hello")
    public String first() {
        return "Java Backend: Connected!\n";
    }}
