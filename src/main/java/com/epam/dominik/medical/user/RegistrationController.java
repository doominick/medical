package com.epam.dominik.medical.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.POST)
    public String register(@RequestBody String json) throws IOException {
        logger.info("Registration controller hit with POST");
        ObjectMapper mapper = new ObjectMapper();
        logger.info("Mapper created");
        User user = mapper.readValue(json, User.class);
        logger.info("Json mapped to User");
        userRepository.save(user);
        logger.info("User persisted in DB");
        Registry registry = user.getRegistry();
        logger.info("Registry extracted from User class");
        registry.setUuid(user.getUuid());
        logger.info("Registry's UUID set");
        registryRepository.save(registry);
        logger.info("Registry persisted in DB");

        return json;
    }
}
