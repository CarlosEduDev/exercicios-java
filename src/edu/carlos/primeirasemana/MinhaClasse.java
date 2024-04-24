package edu.carlos.primeirasemana;

public class MinhaClasse {
    public static void main(String [] args){
        String primeiroNome = "Carlos";
        String segundoNome = "Eduardo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metódo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}