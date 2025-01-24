package com.kws.springboot_docker.repository;

import com.kws.springboot_docker.domain.entity.UrlSha256;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Sha256Repo extends JpaRepository<UrlSha256, Integer> {
}
