package com.keywords.teste.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class Controller {

    @GetMapping("/string")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("testeste");
    }
}
