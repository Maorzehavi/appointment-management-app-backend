package com.maorzehavi.backend.config;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;



@Configuration
@Data
public class TwilioConfig {

    private static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT");
    private static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH");





    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }
}