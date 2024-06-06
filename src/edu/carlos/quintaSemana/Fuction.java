package edu.carlos.quintaSemana;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Fuction {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a function com expressão lamba para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os numeros no Stream e armazená-los em outra lista
        List<Integer> numeroDobrados = numeros.stream()
                .map(dobrar).toList();

//        Imprimir a lista de numeros dobrados
        numeroDobrados.forEach(n -> System.out.println(n));
    }
}
