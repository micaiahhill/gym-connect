package com.gymconnect.hello;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class DataBaseService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataBaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    // Returns outs for DML statements
    public List<Map<String, Object>> executeSQLStatement(String sqlStatement) {
        List<Map<String, Object>> out = Collections.emptyList();
        try{
            out = jdbcTemplate.queryForList(sqlStatement); 
            return out;
        }catch(Exception e){
            try{
                jdbcTemplate.execute(sqlStatement);
            }catch(Exception x){
                e.printStackTrace();
            }
            return out; }}}