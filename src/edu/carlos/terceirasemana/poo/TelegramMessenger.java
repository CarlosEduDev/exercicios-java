package edu.carlos.terceirasemana.poo;

public class TelegramMessenger extends ServicoMensagemInstatanea{
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
