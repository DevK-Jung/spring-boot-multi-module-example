package com.example.multimodule.moduleapi.sample.service;

import com.example.multimodule.dbjpa.entity.Member;
import com.example.multimodule.dbjpa.repository.MemberRepository;
import com.example.multimodule.modulecommon.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SampleService {

    private final MyService myService; // module-common
    private final MemberRepository memberRepository; // module-storage:db-jpa

    public String getCommonModuleMessage() {
        return myService.message();
    }

    public boolean memberSave() {
        Member testMember = new Member("username", 10);
        memberRepository.save(testMember);
        return true;
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}
