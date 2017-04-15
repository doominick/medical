package com.epam.dominik.medical.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by dominik on 4/15/17.
 */

@RestController
@RequestMapping("/user/login")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    @Autowired
    RegistryRepository registryRepository;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestBody String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json,User.class);
        user = userRepository.findByPeselAndFirstNameAndSecondName(user.getPesel(), user.getFirstName(), user.getSecondName());
        logger.info(user.getPesel() + " found!");
        user.setRegistry(registryRepository.findByUuid(user.getUuid()));
        logger.info(user.getUuid().toString());
        return user;
    }

}
