package com.example.demo.domain;

import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.factory.BugData;

public interface IBugFactory {
    Bug createBug(BugData bugData);
}
