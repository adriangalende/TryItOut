package org.mvpigs.tryItOut;

import java.util.Stack;

public class EjercicioFulero1 {
    public static void main(String[] args) {
        Stack<String> pilaCaracteres = new Stack();
        String frase = "Érase una vez el cuerpo humano";
        for (int i=0 ; i < frase.length() ; i++) {
            pilaCaracteres.push(String.valueOf(frase.charAt(i)));
        }

        while (!(pilaCaracteres.isEmpty())) {
            System.out.print(pilaCaracteres.pop() + " ");
        }
    }
}