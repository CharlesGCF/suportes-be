package com.prova.suportes.service.validacao;

import java.util.Stack;

public class Expressao {
    public static boolean isValido(String expressao){
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' && !pilha.isEmpty() && pilha.peek() == '(') {
                pilha.pop();
            } else if (caractere == ']' && !pilha.isEmpty() && pilha.peek() == '[') {
                pilha.pop();
            } else if (caractere == '}' && !pilha.isEmpty() && pilha.peek() == '{') {
                pilha.pop();
            } else {
                return false;
            }
        }

        return pilha.isEmpty();
    }
}
