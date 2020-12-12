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
    private String nomeArquivo;//nome do arquivo onde será salvo o HashSet de produtos
    private HashSet<Produto> produtos;
    
    public Cadastro(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        this.produtos = load();
    }
    
    public String getNomeArquivo(){
        return nomeArquivo;
    }
    
    public HashSet<Produto> getProdutos(){
        return produtos;
    }
    
    public void cadastraProduto(Produto produto){
        produtos.add(produto);
        save();
    }
    
    public Produto pesquisaProdutoNome(String nome) throws Exception{//retorna o objeto "Produto" com o nome informado, se existir
        produtos = load();
        for(Produto produto : produtos){
            if (produto.getNome().equals(nome)){
                return produto;
            }
        }
        throw new Exception();
    }
    
    public Produto pesquisaProdutoCodigo(long codigo) throws Exception{//retorna o objeto "Produto" com o código informado, se existir
        produtos = load();
        for(Produto produto : produtos){
            if (produto.getCodigo() == codigo){
                return produto;
            }
        }
        throw new Exception();
    }
    
    private void save() {//salva as mudanças feitas nas variável "produtos" no arquivo
        GestaoDeArquivos.save(this.produtos, nomeArquivo);
    }

    private HashSet<Produto> load() {//retorna as variáveis armazenadas no arquivo
        return GestaoDeArquivos.load(nomeArquivo);
    }
}


