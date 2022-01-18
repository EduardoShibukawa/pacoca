package com.eduardoshibukawa.pacocasaci;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaciController {

    @Value("${toggle.brasil}")
    private String brasil;

    @GetMapping
    public String getSaci() {
        return brasil;
    }
}