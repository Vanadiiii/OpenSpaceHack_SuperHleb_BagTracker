package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Bug;
import com.example.demo.enums.BugStatus;

import java.util.UUID;

public interface IBugService {
    Bug getBug(UUID bugId);

    UUID createBug(Bug apply);

    void updateBug(UUID bugId, Bug apply);

    void deleteBug(UUID bugId);

    void updateBugStatus(UUID bugId, BugStatus status);

    void appointBugTester(UUID bugId, UUID qaId);

    void relateBugs(UUID parentBugId, UUID childBugId);
}
