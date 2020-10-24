package com.example.demo.domain.impl;

import com.example.demo.domain.IBugDomainService;
import com.example.demo.domain.ICalculationCostDomainService;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.mapper.BugPatcher;
import com.example.demo.domain.repository.IBugRepository;
import com.example.demo.domain.repository.IUserRepository;
import com.example.demo.enums.UserRoles;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class BugDomainService implements IBugDomainService {
    private final BugPatcher bugPatcher;
    private final ICalculationCostDomainService calculationCostDomainService;
    private final IBugRepository bugRepository;
    private final IUserRepository userRepository;

    @Override
    public Bug getBug(UUID bugId) {
        return bugRepository.findById(bugId).orElseThrow();
    }

    @Override
    public List<Bug> getBugsByAuthorId(UUID userId) {// TODO: 24/10/20
        return null;
    }

    @Override
    public List<Bug> getBugsByReviewerId(UUID userId) {// TODO: 24/10/20
        return null;
    }

    @Override
    public UUID createBug(Bug bug) {
        return bugRepository.save(bug).getId();
    }

    @Override
    public void updateBug(UUID bugId, Bug newBug) {
        bugRepository.findById(bugId)
                .map(bug -> bugPatcher.apply(bug, newBug))
                .map(calculationCostDomainService::calculation)
                .ifPresent(bugRepository::save);
    }

    @Override
    public void deleteBug(UUID bugId) {
        bugRepository.deleteById(bugId);
    }


    @Override
    public void appointBugTester(UUID bugId, UUID qaId) {
        User qa = userRepository.findById(qaId)
                .filter(user -> user.getRoles().contains(UserRoles.ROLE_QA))
                .orElseThrow();
        Bug bug = bugRepository.findById(bugId)
                .filter(itBug -> itBug.getReviewer() == null)
                .orElseThrow();
        bug.setReviewer(qa);
        bugRepository.save(bug);
    }

    @Override
    public void relateBugs(UUID parentBugId, UUID childBugId) {

    }
}
