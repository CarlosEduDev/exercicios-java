package edu.carlos.terceirasemana.poo;

public abstract class ServicoMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    /* Protected
     somente são acessíveis dentro da mesma classe, os filhos(sub-classes) e classes do mesmo pacote que conhecem este
     método
    */

    protected void validarConexaoInternet(){
        System.out.println("Validando a conexão com a internet");
    }
}
