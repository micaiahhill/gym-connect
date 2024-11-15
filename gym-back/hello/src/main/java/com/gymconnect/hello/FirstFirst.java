package com.gymconnect.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class FirstFirst {
    private final DataBaseService dataBaseService;

    @Autowired
    public FirstFirst(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public List<Map<String, Object>> executeSql(String statement) {
        return dataBaseService.executeSQLStatement(statement);
    }
}