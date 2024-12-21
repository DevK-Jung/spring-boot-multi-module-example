package com.example.multimodule.moduleapi.sample.controller;

import com.example.multimodule.dbjpa.entity.Member;
import com.example.multimodule.moduleapi.sample.service.SampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "SampleController")
@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @Operation(summary = "common module message 테스트")
    @GetMapping("/module-common/message")
    public String getCommonModuleMessage() {
        return sampleService.getCommonModuleMessage();
    }

    @Operation(summary = "storage module 사용하여 test member 저장")
    @PostMapping("/module-storage/members")
    public boolean membersSave() {
        return sampleService.memberSave();
    }

    @Operation(summary = "storage module 사용하여 test member 조회")
    @GetMapping("/module-storage/members")
    public List<Member> getMembers() {
        return sampleService.getMembers();
    }
}
