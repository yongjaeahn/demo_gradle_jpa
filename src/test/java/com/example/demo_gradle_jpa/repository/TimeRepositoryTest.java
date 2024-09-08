package com.example.demo_gradle_jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TimeRepositoryTest {

    @Autowired
    private TimeRepository timeRepository;

    @Test
    void testGetTime() {
        System.out.print("timeRepository.getClass().getName() : ");
        System.out.println(timeRepository.getClass().getName());

        System.out.print("timeRepository.getTime() : ");
        System.out.println(timeRepository.getTime());

        assertNotNull(timeRepository.getTime());
    }
}