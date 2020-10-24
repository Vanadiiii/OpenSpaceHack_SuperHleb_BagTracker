package com.example.demo.domain;

import com.example.demo.domain.entity.Bug;

import java.util.List;
import java.util.UUID;

public interface IBugDomainService {
    Bug getBug(UUID bugId);

    List<Bug> getBugsByAuthorId(UUID userId);

    List<Bug> getBugsByReviewerId(UUID userId);

    UUID createBug(Bug apply);

    void updateBug(UUID bugId, Bug apply);

    void deleteBug(UUID bugId);

    void appointBugTester(UUID bugId, UUID qaId);

    void relateBugs(UUID parentBugId, UUID childBugId);
}
