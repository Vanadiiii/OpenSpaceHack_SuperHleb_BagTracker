package com.example.demo.controller;

import com.example.demo.controller.dto.BugDataDto;
import com.example.demo.controller.dto.BugDto;
import com.example.demo.controller.mappers.BugDataDtoWebMapper;
import com.example.demo.controller.mappers.BugWebMapper;
import com.example.demo.domain.sevice.IBugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Component
@RestController
@RequestMapping("bug/")
@RequiredArgsConstructor
public class BugController {
    private final IBugService bugService;
    private final BugWebMapper bugWebMapper;
    private final BugDataDtoWebMapper bugDataDtoWebMapper;

    @GetMapping("/{bugId}")
    public ResponseEntity<BugDto> getBug(@PathVariable UUID bugId) {
        return ResponseEntity.ok(bugWebMapper.apply(bugService.getBug(bugId)));

    }

    @PostMapping
    public ResponseEntity<UUID> createBug(@RequestBody BugDataDto bugDataDto) {
        return ResponseEntity.ok(bugService.createBug(bugDataDtoWebMapper.apply(bugDataDto)));
    }

    @PatchMapping("/{bugId}")
    public ResponseEntity<Void> updateBug(@RequestBody BugDto bugDto, @PathVariable String bugId) {
        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{bugId}")
    public ResponseEntity<Void> deleteBug(@PathVariable UUID bugId) {
        return ResponseEntity.ok().build();

    }

    @PostMapping("/{bugId}/status")
    public ResponseEntity<Void> updateBugStatus(@PathVariable UUID bugId) {
        return ResponseEntity.ok().build();

    }

    @PostMapping("/{bugId}/qa/{qaId}")
    public ResponseEntity<Void> appointBugTester(@PathVariable UUID bugId, @PathVariable UUID qaId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{bugId}")
    public ResponseEntity<Void> relateBugs(@PathVariable UUID bugId) {
        return ResponseEntity.ok().build();
    }


}
