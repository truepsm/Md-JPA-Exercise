package com.example.demo.repository;

import com.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Test Repository
 */
@RepositoryRestResource
public interface TestRepository extends JpaRepository<Test, Long> {

    /**
     * findByName
     *
     * @param name String
     * @return Optional<Test>
     */
    Optional<Test> findByName(String name);
}
