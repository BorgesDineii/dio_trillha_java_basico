package equipamentos.multifuncional;
import equiamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;

public class EquipamerntoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }
}
