package edu.carlos.segundasemana;

public class FormatadorNumero {
    public static void main(String[] args) {
        try {
            String numeroFormatado = FormatarNumero("6363");
            System.out.println(numeroFormatado);
        } catch (NumeroCasaException e) {
            System.out.println("Não foi possível formatar o número da casa");
        }

    }

    static String FormatarNumero(String numero) throws NumeroCasaException{
        if(numero.length() != 4)
            throw new NumeroCasaException();

        return "6363";
    }
}
