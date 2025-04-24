/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.fastfood.model;


/**
 *
 * @author nicko
 */
public class Burger implements ItemCombo{
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger bigMac(){
        return new Burger("BigMac", 21.50);
    }

    public static Burger quarteirao(){
        return new Burger("Quarteirão", 18);
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
