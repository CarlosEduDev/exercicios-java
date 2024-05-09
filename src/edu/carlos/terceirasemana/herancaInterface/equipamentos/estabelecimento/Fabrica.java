package edu.carlos.terceirasemana.herancaInterface.equipamentos.estabelecimento;

import edu.carlos.terceirasemana.herancaInterface.equipamentos.impressora.Deskjet;
import edu.carlos.terceirasemana.herancaInterface.equipamentos.impressora.Impressora;
import edu.carlos.terceirasemana.herancaInterface.equipamentos.impressora.Laserjet;
import edu.carlos.terceirasemana.herancaInterface.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();

        impressora.imprimir();
    }
}
