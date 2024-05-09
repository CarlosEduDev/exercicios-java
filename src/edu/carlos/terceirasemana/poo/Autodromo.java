package edu.carlos.terceirasemana.poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("924nn");
//        jeep.ligar();

        Moto z602 = new Moto();
        z602.setChassi("6a8f26");

//        z602.ligar();

        Veiculo coringa = z602;

        coringa.ligar();
    }
}
