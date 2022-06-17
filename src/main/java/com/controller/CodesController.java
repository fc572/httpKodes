package com.controller;

import com.logic.Codes;
import com.logic.RispostaHttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodesController {

    private Codes codes = new Codes();
    private RispostaHttpStatus rispostaHttpStatus = new RispostaHttpStatus();

    @RequestMapping("/codes")
    public String codes(@RequestParam(value = "code") String code, Model model) {
        String message = codes.workOutMeaningOfCode(code);
        model.addAttribute("message", message);
        model.addAttribute("code", code);
        return "codeDisplayPage";
    }

    @RequestMapping("/codeswithheaders")
    public ResponseEntity<String> codesWithHeaders(@RequestParam(value="codestatus") String codestatus, Model model){
        String message = rispostaHttpStatus.responseEntity(codestatus).toString();
        model.addAttribute("message", message);
        model.addAttribute("codestatus", codestatus);
        return rispostaHttpStatus.responseEntity(codestatus);
    }
}