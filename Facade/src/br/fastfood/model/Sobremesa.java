/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.fastfood.model;

/**
 *
 * @author nicko
 */
public class Sobremesa implements ItemCombo{
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Sobremesa torta(){
        return new Sobremesa("Torta", 10);
    }

    public static Sobremesa sorvete(){
        return new Sobremesa("Sorvete", 17.50);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
