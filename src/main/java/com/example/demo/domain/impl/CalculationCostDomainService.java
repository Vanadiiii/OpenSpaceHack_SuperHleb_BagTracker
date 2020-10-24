package com.example.demo.domain.impl;

import com.example.demo.domain.ICalculationCostDomainService;
import com.example.demo.domain.entity.Bug;
import org.springframework.stereotype.Component;

@Component
public class CalculationCostDomainService implements ICalculationCostDomainService {

    @Override
    public Bug calculation(Bug bug) {
        bug.setCost(bug.getBugType().getCost() + bug.getBugStatus().getCost());
        return bug;
    }
}
