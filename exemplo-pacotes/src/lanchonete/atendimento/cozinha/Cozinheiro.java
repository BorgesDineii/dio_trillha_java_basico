package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural hamburger no balcão");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão.");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche() {
        System.out.println("Preparando lanche tipo hambuger.");
    }
    public void prepararVitamina() {
        System.out.println("Preparando suco.");
    }
    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche() {
        System.out.println("Selecionado pão, salada, ovo e carne.");
    }
    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionado fruta, leite e suco.");
    }
    public void lavarIngredientes() {
        System.out.println("Lavando ingredientes.");
    }
    public void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador.");
    }
    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e ovo para o hamburger.");
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
