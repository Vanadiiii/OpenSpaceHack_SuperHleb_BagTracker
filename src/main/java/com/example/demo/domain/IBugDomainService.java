package com.example.demo.domain;

import com.example.demo.domain.entity.Bug;

import java.util.UUID;

public interface IBugDomainService {
    Bug getBug(UUID bugId);

    UUID createBug(Bug apply);

    void updateBug(UUID bugId, Bug apply);

    void deleteBug(UUID bugId);

    void appointBugTester(UUID bugId, UUID qaId);

    void relateBugs(UUID parentBugId, UUID childBugId);
}
