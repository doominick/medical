package com.epam.dominik.medical.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;

/**
 * Created by dominik on 04.04.17.
 */

@RestController
@RequestMapping("/user/register")
public class RegistrationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;
    @Autowired
    RegistryRepository registryRepository;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public RegisterResponse register(@RequestBody String json) throws IOException {
        logger.info("Registration controller hit with POST");
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json, User.class);
        userRepository.save(user);
        user.getRegistry().setUuid(user.getUuid());
        registryRepository.save(user.getRegistry());
        logger.info("User " + user.getSecondName() + " persisted!");

        return new RegisterResponse("200", "Registered");
    }
}
