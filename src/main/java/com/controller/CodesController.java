package com.controller;

import com.logic.Codes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodesController {

    private static final String template = "The code number %s means %s";
    private Codes codes = new Codes();

    @RequestMapping("/codes")
    public String codes(@RequestParam(value = "code") String code) {
        String message = codes.workOutMeaningOfCode(code);
        return (String.format(template, code, message));
    }
}