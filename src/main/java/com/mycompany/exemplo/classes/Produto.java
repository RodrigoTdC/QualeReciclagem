/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.classes;

import java.util.HashMap;

/**
 *
 * @author rotos
 */
public class Produto {
    public enum Materiais{PAPEL, PLASTICO, VIDRO, METAL;}
    
    private String nome;
    private String marca;
    private String categoria;
    private int codigo;
    private HashMap<String, Materiais> partes;
    
    public Produto(String nome, String marca, String categoria, int codigo, HashMap<String, Materiais> partes){
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.codigo = codigo;
        this.partes = partes;
    }
    
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getCodigo(){
        return codigo;
    }
    public HashMap<String, Materiais> getPartes(){
        return partes;
    }
}
