package edu.carlos.quintaSemana;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        //Usar o supplier para obter uma lista de 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5).toList();

        //imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
