package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.IBugDomainService;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.sevice.IBugService;
import com.example.demo.enums.BugStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@RequiredArgsConstructor
public class BugService implements IBugService {

    private final IBugDomainService bugDomainService;

    @Override
    public Bug getBug(UUID bugId) {
        return bugDomainService.getBug(bugId);
    }

    @Override
    public UUID createBug(Bug bug) {
        return bugDomainService.createBug(bug);
    }

    @Override
    public void updateBug(UUID bugId, Bug apply) {
        bugDomainService.updateBug(bugId, apply);
    }

    @Override
    public void deleteBug(UUID bugId) {
        bugDomainService.deleteBug(bugId);
    }

    @Override
    public void updateBugStatus(UUID bugId, BugStatus status) {
        bugDomainService.updateBug(bugId, Bug.builder().bugStatus(status).build());
    }

    @Override
    public void appointBugTester(UUID bugId, UUID qaId) {
        bugDomainService.appointBugTester(bugId, qaId);
    }

    @Override
    public void relateBugs(UUID parentBugId, UUID childBugId) {
        bugDomainService.relateBugs(parentBugId, childBugId);
    }
}
