package edu.carlos.primeirasemana;

public class Operadores {

    String name;
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        System.out.println(soma);

        int subtracao = 113 - 55;
        System.out.println(subtracao);

        int multip = 5 * 9;
        System.out.println(multip);

        int divisao = 15 / 3;
        System.out.println(divisao);

        int modulo = 8 % 2;
        System.out.println(modulo);

        double resultado = (10 * 8) + (20 / 4);
        System.out.println(resultado);

        int idade = 19;

        String nomeCompleto = "Carlos" + " Eduardo";
        System.out.println("Olá, meu nome é " + nomeCompleto + "e " +
                "eu tenho " + idade + " anos");

        for(var i = 0; i< 10; i++){
                System.out.println("olá");
        }

        int numero = 4;
        numero++;
        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 5;
        String result = a == b ? "verdadeiro" : "falso";

        System.out.println(result);

//        Operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("Uma duas condições são verdadeiras");
        }else{
            System.out.println("Uma das condições são falsas");
        }
        System.out.println("fim");
    }
}
