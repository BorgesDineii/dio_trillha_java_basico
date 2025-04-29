package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que nao precisam estarem disponiveis para toda a aplicação
        //cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
        // cozinheiro.selecionarIngredientesLanche();
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
        //cozinheiro.prepararCombo();
    
        //  ações que estebelcimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        // ações que ano precisam estar disponiveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controleSaida();
        

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //atendente.pegarPedidoBalcao();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento ainda não deficniu normas de atendimento
        

        // esta ação é muito sigilosa, que tal ser privada?
        //cliente.consultarSaldoAplicativo();

        //ja pensou os clientes ouvindo que o gas acabou?
        //cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
