package edu.carlos.segundasemana;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Execoes {
    public static void main(String[] args) {
//        try {
//            //criando o objeto scanner
//            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//
//            System.out.println("Digite seu nome");
//            String nome = scanner.next();
//
//            System.out.println("Digite seu sobrenome");
//            String sobrenome = scanner.next();
//
//            System.out.println("Digite sua idade");
//            int idade = scanner.nextInt();
//
//            System.out.println("Digite sua altura");
//            double altura = scanner.nextDouble();
//
//            System.out.println("Olá, me chamo " + nome.toUpperCase() + sobrenome.toUpperCase() + " ");
//            System.out.println("Tenho " + idade + " anos ");
//            System.out.println("Minha altura é " + altura + "cm");
//
//            scanner.close();
//        }
//        catch (InputMismatchException e){
//            System.out.println("Os campos idade e altura precisam ser númericos");
//        }

        //Outra exceção
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
