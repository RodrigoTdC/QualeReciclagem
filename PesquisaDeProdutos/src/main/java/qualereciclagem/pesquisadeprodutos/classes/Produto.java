/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualereciclagem.pesquisadeprodutos.classes;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author rotos
 */
public class Produto implements Serializable{
    //public enum Materiais{PAPEL, PLASTICO, VIDRO, METAL;}
    
    private final String nome;
    private final String marca;
    private final String categoria;
    private final long codigo;
    private final HashMap<String, Materiais> partes;
    
    public Produto(String nome, String marca, String categoria, long codigo, HashMap<String, Materiais> partes){
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
    public long getCodigo(){
        return codigo;
    }
    public HashMap<String, Materiais> getPartes(){
        return partes;
    }
}
