package edu.carlos.quintaSemana;

import java.util.Arrays;
import java.util.List;
public class Predicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "JavaScript", "Python", "C", "Ruby", "Go");

        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        java.util.function.Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() < 5;

        /*
        * Usar o Stream para filtrar as palavras com mais de 5 caracteres e,
        * em seguida, imprimir cada palavra que passou no filtro
        */
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
