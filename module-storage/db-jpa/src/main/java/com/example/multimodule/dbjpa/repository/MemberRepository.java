package com.example.multimodule.dbjpa.repository;

import com.example.multimodule.dbjpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
