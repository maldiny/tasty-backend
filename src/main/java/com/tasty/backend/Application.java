package com.tasty.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello Rus!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
