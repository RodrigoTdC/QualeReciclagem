/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.classes;

import java.util.ArrayList;

/**
 *
 * @author rotos
 */
public class Fabricante {
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public Fabricante(String nome, Produto produto){
        this.nome = nome;
        this.produtos.add(produto);
    }
}
