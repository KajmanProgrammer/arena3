package com.example.arena.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class ApplyController {

    @RequestMapping(value = "form/apply", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity aa(MultipartHttpServletRequest request) {
        System.out.println("bbb " + " " + request);
        return ResponseEntity.ok().build();
    }
}
