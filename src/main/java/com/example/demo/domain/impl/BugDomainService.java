package com.example.demo.domain.impl;

import com.example.demo.domain.IBugDomainService;
import com.example.demo.domain.ICalculationCostDomainService;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.mapper.BugPatcher;
import com.example.demo.domain.repository.IBugRepository;
import com.example.demo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class BugDomainService implements IBugDomainService {
    private final BugPatcher bugPatcher;
    private final ICalculationCostDomainService calculationCostDomainService;
    private final IBugRepository bugRepository;
    private final UserRepository userRepository;

    @Override
    public Bug getBug(UUID bugId) {
        return bugRepository.findById(bugId).orElseThrow();
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
        User qa = userRepository.findById(qaId).filter(user -> user.getRoles().contains(QA)).orElseThrow();
        Bug bug = bugRepository.findById(bugId).filter(itBug -> itBug.getReviewer() == null).orElseThrow();
        bug.setReviewer(qa);
        bugRepository.save(bug);
    }

    @Override
    public void relateBugs(UUID parentBugId, UUID childBugId) {

    }
}
