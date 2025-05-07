package Estabelecimento;

import equiamentos.impressora.DeskJet;
import equiamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.multifuncional.EquipamerntoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamerntoMultifuncional em = new EquipamerntoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
