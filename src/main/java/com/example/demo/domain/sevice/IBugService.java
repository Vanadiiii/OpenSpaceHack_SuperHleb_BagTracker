package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Bug;

import java.util.UUID;

public interface IBugService {
    Bug getBug(UUID bugId);

    UUID createBug(Bug apply);

    void updateBug();

    void deleteBug();

    void updateBugStatus();

    void appointBugTester();

    void relateBugs();
}
