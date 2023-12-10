package com.prova.suportes.service.validacao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ExpressaoTest {

    @ParameterizedTest
    @MethodSource("valorValido")
    @DisplayName("Deve retornar true para expressões válidas")
    void testIsValido(String valor) {
        assertTrue(Expressao.isValido(valor));
    }

    @ParameterizedTest
    @MethodSource("valorInvalido")
    @DisplayName("Deve retornar false para expressões Inválidos")
    void testIsValidoFalse(String valor) {
        assertFalse(Expressao.isValido(valor));
    }

    static Stream<String> valorValido() {
        return Stream.of("{[()]}", "(){}[]", "{()}{}");
    }

    static Stream<String> valorInvalido() {
        return Stream.of("[]{()", "[{)]", "{(})");
    }
}