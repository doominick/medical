package com.epam.dominik.medical.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by dominik on 04.04.17.
 */

@RestController
public class RegistrationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/register")
    public String register(){
        logger.info("Registration controller hit");
        return "Registration page";
    }
}
