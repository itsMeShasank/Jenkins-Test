package com.epam.jenkinstesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<String> firstEndPoint() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
