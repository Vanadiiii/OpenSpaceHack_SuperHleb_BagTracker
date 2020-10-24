package com.example.demo.domain.factory;

import com.example.demo.domain.IBugFactory;
import com.example.demo.domain.ICalculationCostDomainService;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.mapper.BugDataDomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BugFactory implements IBugFactory {

    private final ICalculationCostDomainService calculationCostDomainService;
    private final BugDataDomainMapper bugDataDomainMapper;

    @Override
    public Bug createBug(BugData bugData) {
        return Optional.ofNullable(bugData)
                .map(bugDataDomainMapper)
                .map(calculationCostDomainService::calculation)
                .orElseThrow();
    }
}
