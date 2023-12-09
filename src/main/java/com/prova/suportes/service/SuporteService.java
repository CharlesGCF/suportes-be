package com.prova.suportes.service;

import com.prova.suportes.service.validacao.Expressao;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class SuporteService {
    public void validaExpressao(String expressao) throws Exception {
        if(!Expressao.isValido(expressao)){
            //todo exception personalizada
            throw new Exception("Expressão inválida: " + expressao );
        }
    }
}
