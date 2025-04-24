/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.fastfood.model;

/**
 *
 * @author nicko
 */
public class Combo {
    private String nomeCombo;
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;

    public Combo(ItemCombo bebida, ItemCombo burger, ItemCombo sobremesa) {
        this.bebida = bebida;
        this.burger = burger;
        this.sobremesa = sobremesa;
    }

    public String getItens(){
        return nomeCombo + "\n"
        + burger.toString() + "\n"
        + bebida.toString() + "\n"
        + sobremesa.toString();
    }

    public double getPrecoTotal(){
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

    public void setNomeCombo(String nomeCombo) {
        this.nomeCombo = nomeCombo;
    }
}
