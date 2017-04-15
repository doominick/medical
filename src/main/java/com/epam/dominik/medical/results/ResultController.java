package com.epam.dominik.medical.results;

import com.epam.dominik.medical.user.User;
import com.epam.dominik.medical.user.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by dominik on 4/15/17.
 */
@RestController
@RequestMapping("/results/submit")
public class ResultController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ResultRepository resultRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public String submit(@RequestBody String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Result result = mapper.readValue(json, Result.class);
        resultRepository.save(result);
        User user = userRepository.findOne(result.getUID());
        logger.info("Result for " + user.getSecondName());
        return "Result submitted";
    }
}
