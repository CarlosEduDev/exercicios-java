package edu.carlos.primeirasemana;

public class PlanoOperadora {
    public static void main(String[] args) {
        char plano = 'T'; // B, M, T

        switch (plano){
            case 'T':{
                System.out.println("5GB Youtube");
                break;
            }
            case 'M':{
                System.out.println("Whats e Instagram grátis");
                break;
            }
            case 'B':{
                System.out.println("100 minutos de ligação");
                break;
            }
        }
    }
}
