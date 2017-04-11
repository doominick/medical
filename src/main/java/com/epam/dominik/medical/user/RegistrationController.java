package com.epam.dominik.medical.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by dominik on 04.04.17.
 */

@RestController
@RequestMapping("/user/register")
public class RegistrationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public String registerGet(){
        logger.info("Registration controller hit with GET");
        return "Registration controller is alive, please use POST for an action";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(){
        logger.info("Registration controller hit with POST");
        return "JSON";
    }
}
