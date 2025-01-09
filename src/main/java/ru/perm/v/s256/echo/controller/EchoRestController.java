package ru.perm.v.s256.echo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoRestController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String echo() {
        logger.info("Echo");
        return "Echo";
    }

}
