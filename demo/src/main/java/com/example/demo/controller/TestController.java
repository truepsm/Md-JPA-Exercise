package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Test Controller
 */
@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    /**
     * findById
     *
     * @param id long
     * @return Test
     */
    @GetMapping("/{id}")
    public Test findById(@PathVariable("id") long id) {

        return this.testService.findById(id);
    }

    /**
     * findByName
     *
     * @param name String
     * @return Test
     */
    @GetMapping("/name/{name}")
    public Test findByName(@PathVariable("name") String name) {

        return this.testService.findByName(name);
    }

    /**
     * findAll
     *
     * @return List<Test>
     */
    @GetMapping
    public List<Test> findAll() {

        return this.testService.findAll();
    }
}
