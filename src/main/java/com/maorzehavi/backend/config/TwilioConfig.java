package com.maorzehavi.backend.config;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;


@Configuration
@Data
public class TwilioConfig {
    @Getter
    private static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    @Getter
    private static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");


    @PostConstruct
    public void init() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }
}