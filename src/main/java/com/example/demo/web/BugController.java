package com.example.demo.web;

import com.example.demo.domain.sevice.IBugService;
import com.example.demo.enums.BugStatus;
import com.example.demo.web.dto.BugDataDto;
import com.example.demo.web.dto.BugDto;
import com.example.demo.web.mapper.BugDataDtoWebMapper;
import com.example.demo.web.mapper.BugDtoWebMapper;
import com.example.demo.web.mapper.BugWebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("bug/")
@RequiredArgsConstructor
public class BugController {
    private final IBugService bugService;
    private final BugWebMapper bugWebMapper;
    private final BugDataDtoWebMapper bugDataDtoWebMapper;
    private final BugDtoWebMapper bugDtoWebMapper;

    @GetMapping("/{bugId}")
    public ResponseEntity<BugDto> getBug(@PathVariable UUID bugId) {
        return ResponseEntity.ok(bugWebMapper.apply(bugService.getBug(bugId)));

    }

    @PostMapping
    public ResponseEntity<UUID> createBug(@RequestBody BugDataDto bugDataDto) {
        return ResponseEntity.ok(bugService.createBug(bugDataDtoWebMapper.apply(bugDataDto)));
    }

    @PatchMapping("/{bugId}")
    public ResponseEntity<Void> updateBug(@PathVariable UUID bugId, @RequestBody BugDto bugDto) {
        bugService.updateBug(bugId, bugDtoWebMapper.apply(bugDto));
        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{bugId}")
    public ResponseEntity<Void> deleteBug(@PathVariable UUID bugId) {
        bugService.deleteBug(bugId);
        return ResponseEntity.ok().build();

    }

    @PostMapping("/{bugId}/status/{status}")
    public ResponseEntity<Void> updateBugStatus(@PathVariable UUID bugId, @PathVariable BugStatus status) {
        bugService.updateBugStatus(bugId, status);
        return ResponseEntity.ok().build();

    }

    @PostMapping("/{bugId}/qa/{qaId}")
    public ResponseEntity<Void> appointBugTester(@PathVariable UUID bugId, @PathVariable UUID qaId) {
        bugService.appointBugTester(bugId, qaId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{parentBugId}/link/{childBugId}")
    public ResponseEntity<Void> relateBugs(@PathVariable UUID parentBugId, @PathVariable UUID childBugId) {
        bugService.relateBugs(parentBugId, childBugId);
        return ResponseEntity.ok().build();
    }


}
