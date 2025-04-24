/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.fastfood.model;

/**
 *
 * @author nicko
 */
public class Bebida implements ItemCombo{
     private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Bebida cocaCola(){
        return new Bebida("Coca-cola", 7.00);
    }

    public static Bebida sucoDeUva(){
        return new Bebida("Suco De Uva", 8.00);
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
