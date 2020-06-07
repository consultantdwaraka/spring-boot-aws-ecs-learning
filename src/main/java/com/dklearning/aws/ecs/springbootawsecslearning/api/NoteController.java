package com.dklearning.aws.ecs.springbootawsecslearning.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/v1")
public class NoteController {

    @GetMapping(value="/note")
    public String getNote() {
        return "This is a sample note message!";
    }
    
}