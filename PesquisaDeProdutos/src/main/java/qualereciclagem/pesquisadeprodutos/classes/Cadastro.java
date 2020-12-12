/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualereciclagem.pesquisadeprodutos.classes;

import java.util.HashSet;

/**
 *
 * @author rotos
 */
public class Cadastro {
    private HashSet<Produto> produtos;
    private HashSet<Fabricante> fabricantes;
    
    public void cadastraProduto(){
        
    }
    
    public Produto pesquisaProdutoNome(String nome) throws Exception{
        for(Produto produto : produtos){
            if (produto.getNome().equals(nome)){
                return produto;
            }
        }
        throw new Exception();
    }
    
    public Produto pesquisaProdutoCodigo(long codigo) throws Exception{
        for(Produto produto : produtos){
            if (produto.getCodigo() == codigo){
                return produto;
            }
        }
        throw new Exception();
    }
    
    /*
    public Fabricante pesquisaFabricante(String nome) throws Exception{
        for(Fabricante fabricante : fabricantes){
            if (fabricante.getNome().equals(nome)){
                return fabricante;
            }
        }
        throw new Exception();
    }
    */
}


