package com.kws.springboot_docker.api;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//@Validated
public class HomeApi {

    @GetMapping("/")
    public String index() {
        return "\"Hello World!\"";
    }

}
