package com.kws.springboot_docker.application;

import com.kws.springboot_docker.domain.entity.UrlSha256;
import com.kws.springboot_docker.repository.Sha256Repository;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Sha256Service implements DbService {

    private final Sha256Repository sha256Repository;

    public UrlSha256 retrieve(int id) {
        return sha256Repository.retrieve(id);
    }
}
