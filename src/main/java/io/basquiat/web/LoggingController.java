package io.basquiat.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * created by basquiat
 *
 */
@Slf4j
@RestController
public class LoggingController {
 
    @RequestMapping("/")
    public String index() {
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        return "Hi! There!";
    }
    
}