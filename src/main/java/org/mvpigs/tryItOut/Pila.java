package org.mvpigs.tryItOut;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<String> pilaCaracteres = new Stack();
        String frase = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
        for (int i=0 ; i < frase.length() ; i++) {
            pilaCaracteres.push(String.valueOf(frase.charAt(i)));
        }

        while (!(pilaCaracteres.isEmpty())) {
            System.out.print(pilaCaracteres.pop() + " ");
        }

    }
}