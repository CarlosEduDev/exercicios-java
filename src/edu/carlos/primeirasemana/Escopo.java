package edu.carlos.primeirasemana;

public class Escopo {
    double saldo = 10.0; //variavel da classe 'Escopo'

    public void sacar(double valor){
        double novoSaldo = saldo - valor; //variavel local de metodo
    }

    public void imprimirSaldo(){
        System.out.println(saldo); //Disponível em toda classe

        /*somente o método sacar conhece esta variavel*/
        //System.out.println(novoSaldo);
    }
}
