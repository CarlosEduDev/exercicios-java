package edu.carlos.terceirasemana.poo;

public class FacebookMessenger extends ServicoMensagemInstatanea{
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebedo mensagem pelo Facebook");
    }
}
