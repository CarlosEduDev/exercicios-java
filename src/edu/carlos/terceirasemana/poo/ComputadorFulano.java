package edu.carlos.terceirasemana.poo;

public class ComputadorFulano {
    public static void main(String[] args) {
        ServicoMensagemInstatanea smi = null;

        /*
        NÃO SE SABE QUAL APP
        MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg")) {
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        smi.validarConexaoInternet(); /* por estar no mesmo pacote, está funcionando, porém, não é uma boa prática,
         caso esteja em um pacote diferente, estaria dando erro.
         */
    }
}
