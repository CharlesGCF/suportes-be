package com.prova.suportes.handler;

import com.prova.suportes.handler.exception.ExpressaoInvalidaException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@Slf4j
@ControllerAdvice
public class Handler {
    @ExceptionHandler(ExpressaoInvalidaException.class)
    public ResponseEntity<Object> handlerExpressaoInvalidaException(ExpressaoInvalidaException ex, WebRequest request) {
        String mensagemErro = ex.getMessage();
        log.info("handlerExpressaoInvalidaException: {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagemErro);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(Exception ex, WebRequest request) {
        String mensagemErro = "Ocorreu um erro interno";
        log.error("Exception: {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
    }
}
