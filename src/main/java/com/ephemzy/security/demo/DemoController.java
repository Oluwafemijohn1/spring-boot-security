package com.ephemzy.security.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
//        return new ResponseEntity<>("Hello from secured endpoint", HttpStatus.OK);
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
