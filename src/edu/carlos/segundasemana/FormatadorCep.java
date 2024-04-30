package edu.carlos.segundasemana;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237680664");
            System.out.println(cepFormatado);
        } catch (CepValidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepValidoException{
        if(cep.length() != 8)
            throw new CepValidoException();

        return "23.768-064";
    }
}
