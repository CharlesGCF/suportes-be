package com.prova.suportes.service;

import com.prova.suportes.handler.exception.ExpressaoInvalidaException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class SuporteServiceTest {

    @InjectMocks
    private SuporteService service;

    @Test
    @DisplayName("Deve validar expressão corretamente")
    void testValidaExpressao() {
        String expressao = "{}[]()";

        assertDoesNotThrow(() -> service.validaExpressao(expressao));
    }

    @Test
    @DisplayName("Deve tratar exceção  corretamente")
    void testValidaExpressaoException() {
        String expressao = "{}[](";

        assertThrows(ExpressaoInvalidaException.class, () -> service.validaExpressao(expressao));
    }
}