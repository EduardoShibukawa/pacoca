package com.eduardoshibukawa.pacocaiara;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IaraController {

    private final IaraConfiguration iaraConfiguration;

    public IaraController(IaraConfiguration iaraConfiguration) {
        this.iaraConfiguration = iaraConfiguration;
    }

    @GetMapping
    public String getIara() {
        return "Config: " + iaraConfiguration.getOie();
    }
}