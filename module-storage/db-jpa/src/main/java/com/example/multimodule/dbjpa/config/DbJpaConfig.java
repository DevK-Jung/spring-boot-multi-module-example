package com.example.multimodule.dbjpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.example.multimodule.dbjpa.entity") // 엔티티 스캔
@EnableJpaRepositories(basePackages = "com.example.multimodule.dbjpa.repository") // JPA 리포지토리 설정
public class DbJpaConfig {
    // 추가 설정이 필요하다면 여기에 작성
}
