package edu.carlos.primeirasemana;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++; //volume = volume + 1
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--; //volume = volume - 1
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
