package edu.carlos.terceirasemana.herancaInterface.equipamentos.multifuncional;

import edu.carlos.terceirasemana.herancaInterface.equipamentos.copiadora.Copiadora;
import edu.carlos.terceirasemana.herancaInterface.equipamentos.digitalizadora.Digitalizadora;
import edu.carlos.terceirasemana.herancaInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiadora() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }
}
