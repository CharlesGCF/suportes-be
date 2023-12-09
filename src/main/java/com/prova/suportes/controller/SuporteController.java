package com.prova.suportes.controller;

import com.prova.suportes.service.SuporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/validate")
public class SuporteController {
    @Autowired
    private SuporteService service;

    @PostMapping
    public ResponseEntity<Void> validaExpressao(@RequestBody String expressao){
        service.validaExpressao(expressao);

        return ResponseEntity.ok().build();
    }
}
