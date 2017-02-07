package com.controller;

import com.logic.Codes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodesController {

    private Codes codes = new Codes();

    @RequestMapping("/codes")
    public String codes(@RequestParam(value = "code") String code, Model model) {
        String message = codes.workOutMeaningOfCode(code);
        model.addAttribute("message", message);
        model.addAttribute("code", code);
        return "codeDisplayPage";
    }
}