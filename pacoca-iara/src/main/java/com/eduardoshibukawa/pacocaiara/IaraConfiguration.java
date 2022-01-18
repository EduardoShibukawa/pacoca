package com.eduardoshibukawa.pacocaiara;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "iara")
public class IaraConfiguration {

    private String oie;

    public String getOie() {
        return oie;
    }

    public void setOie(String oie) {
        this.oie = oie;
    }
}
