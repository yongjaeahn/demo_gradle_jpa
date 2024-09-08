package com.example.demo_gradle_jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TimeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getTime() {
        return jdbcTemplate.queryForObject("SELECT sysdate FROM dual", String.class);
    }
}