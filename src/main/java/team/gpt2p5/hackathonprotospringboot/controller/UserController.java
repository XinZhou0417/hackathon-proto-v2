package team.gpt2p5.hackathonprotospringboot.controller;


import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.gpt2p5.hackathonprotospringboot.model.User;
import team.gpt2p5.hackathonprotospringboot.rest.HttpStatusCode;

@RestController
@RequestMapping("/user")
public class UserController {

    static final Logger logger = LogManager.getLogger(UserController.class);

    @GetMapping("/{userId}")
    public User getUserByID(@PathVariable String userId) {
        logger.info("entered getUserByID method");
        User user = new User(userId, "neo", "neo@matrix.com");
        return user;
//        String body = new ObjectMapper().writeValueAsString(user);
//        AwsProxyResponse response = new AwsProxyResponse(HttpStatusCode.SUCCESS, null, body);
//        return response;

    }

    @GetMapping
    public User getUser() {
        logger.info("entered getUser method");
        User user = new User("090", "neo", "neo@matrix.com");
        return user;
//        String body = new ObjectMapper().writeValueAsString(user);
//        AwsProxyResponse response = new AwsProxyResponse(HttpStatusCode.SUCCESS, null, body);
//        return response;
    }

}
