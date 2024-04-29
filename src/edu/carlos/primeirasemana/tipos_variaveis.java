package edu.carlos.primeirasemana;

public class tipos_variaveis {
   public static void main(String [] args){
       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal; //casting

       int numero = 2;
       numero = 6;
       System.out.println(numero);

       final double VALOR_PI = 3.14; // o valor não pode ser
       // alterado(const do JS)
   }
}
