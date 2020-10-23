package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.sevice.IBugService;
import com.example.demo.enums.BugStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@RequiredArgsConstructor
public class BugService implements IBugService {

    @Override
    public Bug getBug(UUID bugId) {
        return null;
    }

    @Override
    public UUID createBug(Bug apply) {
        return null;
    }

    @Override
    public void updateBug(UUID bugId, Bug apply) {

    }

    @Override
    public void deleteBug(UUID bugId) {

    }

    @Override
    public void updateBugStatus(UUID bugId, BugStatus status) {

    }

    @Override
    public void appointBugTester(UUID bugId, UUID qaId) {

    }

    @Override
    public void relateBugs(UUID parentBugId, UUID childBugId) {

    }
}
