package com.prova.suportes.service;

import com.prova.suportes.handler.exception.ExpressaoInvalidaException;
import com.prova.suportes.service.validacao.Expressao;
import org.springframework.stereotype.Service;

@Service
public class SuporteService {
    public void validaExpressao(String expressao) {
        if (!Expressao.isValido(expressao)) {
            throw new ExpressaoInvalidaException("Expressão inválida: " + expressao);
        }
    }
}
