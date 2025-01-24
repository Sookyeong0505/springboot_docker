package com.kws.springboot_docker.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "url_sha256")
public class UrlSha256 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "url_sha256_id_gen")
    @SequenceGenerator(name = "url_sha256_id_gen", sequenceName = "url_sha256_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "sha256_hash", nullable = false, length = 64)
    private String sha256Hash;

    @Column(name = "replace_w", nullable = false, length = Integer.MAX_VALUE)
    private String replaceW;

    @Column(name = "protocol", nullable = false, length = 30)
    private String protocol;

    @Column(name = "port", nullable = false)
    private Integer port;

    @Column(name = "file_path", nullable = false, length = Integer.MAX_VALUE)
    private String filePath;

    @Column(name = "nude", nullable = false, length = Integer.MAX_VALUE)
    private String nude;

    @Column(name = "sex", nullable = false, length = Integer.MAX_VALUE)
    private String sex;

    @Column(name = "vio", nullable = false)
    private Boolean vio = false;

    @Column(name = "lang", nullable = false, length = Integer.MAX_VALUE)
    private String lang;

    @Column(name = "ill", nullable = false, length = Integer.MAX_VALUE)
    private String ill;

    @Column(name = "hrm", nullable = false, length = Integer.MAX_VALUE)
    private String hrm;

    @Column(name = "_type", nullable = false, length = Integer.MAX_VALUE)
    private String type;

    @Column(name = "_flag", nullable = false, length = Integer.MAX_VALUE)
    private String flag;

}