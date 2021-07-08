package com.example.demo.service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TestService
 */
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    /**
     * findById
     *
     * @param id long
     * @return Test
     */
    public Test findById(long id) {

        return this.testRepository.findById(id).orElse(null);
    }

    /**
     * findByName
     *
     * @param name String
     * @return Test
     */
    public Test findByName(String name) {

        return this.testRepository.findByName(name).orElse(null);
    }

    /**
     * findAll
     *
     * @return List<Test>
     */
    public List<Test> findAll() {

        return this.testRepository.findAll();
    }

}
