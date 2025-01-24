package com.kws.springboot_docker.repository;

import com.kws.springboot_docker.domain.entity.UrlSha256;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Builder
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Sha256Repository {

    private final Sha256Repo sha256Repo;

    @Transactional(readOnly = true)
    public UrlSha256 retrieve(int id) {
        return sha256Repo
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id"));
    }
}
