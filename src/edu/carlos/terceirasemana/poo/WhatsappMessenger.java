package edu.carlos.terceirasemana.poo;

public class WhatsappMessenger extends ServicoMensagemInstatanea{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Whatsapp");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Whatsapp");
    }
}
