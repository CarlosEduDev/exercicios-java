package edu.carlos.quintaSemana;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    //exemplo de uso
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //usar o Consumer com expressão lamba para imprimir pares
        java.util.function.Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.forEach(imprimirNumeroPar);
    }
}
