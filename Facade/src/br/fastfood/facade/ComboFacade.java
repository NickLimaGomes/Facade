
package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;



public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigoCombo){
        switch (codigoCombo) {
            case 1:
                combo = new Combo(Bebida.cocaCola(), Burger.bigMac(), Sobremesa.sorvete());
                combo.setNomeCombo("Combo Master");
                break;
            case 2:
                combo = new Combo(Bebida.sucoDeUva(), Burger.quarteirao(), Sobremesa.torta());
                combo.setNomeCombo("Super Combo");
                break;
        }
    }

    public void exibirItens(){
        System.out.println(combo.getItens());
    }

    public double getPrecoTotal(){
        return combo.getPrecoTotal();
    }
}
