/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualereciclagem.pesquisadeprodutos.classes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rotos
 */
public class InterfaceDeUsuario {
    private Scanner teclado = new Scanner(System.in);
    
    public void exibeInterface(Cadastro cadastro) throws Exception{
        System.out.println("------------");
        System.out.println("1 - Pesquisa de produto");
        System.out.println("2 - Cadastro de produto");
        System.out.println("0 - Sair");
        byte escolha = teclado.nextByte();
        teclado.nextLine();
        if (escolha == 1){
            pesquisar(cadastro);
        }
        else if (escolha == 2){
            cadastrar(cadastro);
        }
        else{
            throw new Exception();
        }
    }
    
    private void pesquisar(Cadastro cadastro) throws Exception{
        System.out.println("------------");
        System.out.println("1 - Pesquisar por nome");
        System.out.println("2 - Pesquisar por código de barras");
        System.out.println("0 - Voltar");
        byte escolha = teclado.nextByte();
        teclado.nextLine();
        
        if (escolha == 1){
            System.out.println("------------");
            System.out.println("Digite o nome do produto:");
            String nome = teclado.nextLine();
            try {
                imprimeProduto(cadastro.pesquisaProdutoNome(nome));
            } catch (Exception ex) {
                System.out.println("Produto não encontrado");
            }
        }
        else if (escolha == 2){
            System.out.println("Digite o código do produto:");
            long codigo = teclado.nextLong();
            try {
                imprimeProduto(cadastro.pesquisaProdutoCodigo(codigo));
            } catch (Exception ex) {
                System.out.println("Produto não encontrado");
            }
        }
        else{
            throw new Exception();
        }
    }
    
    private void cadastrar(Cadastro cadastro){
        System.out.println("------------");
        
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Marca: ");
        String marca = teclado.nextLine();
        
        System.out.println("Categoria: ");
        String categoria = teclado.nextLine();
        
        System.out.println("Código de Barras: ");
        long codigo = teclado.nextLong();
        
        System.out.println("Quant. de partes: ");
        int nPartes = teclado.nextInt();
        teclado.nextLine();
        HashMap<String, Materiais> partes = new HashMap<>();
        for (int i = 0; i < nPartes;){
            System.out.println("Nome da parte " + (i+1) + ":");
            String nomeParte = teclado.nextLine();
            System.out.println("Material da parte " + (i+1) + ":");
            String materialParte = teclado.nextLine();
            try{
                partes.put(nomeParte, Materiais.valueOf(materialParte.toUpperCase()));
                i++;
            }
            catch (IllegalArgumentException e){
                 System.out.println("O material deve ser papel, plástico, vidro ou metal.");
            }
        }
        
        Produto produto = new Produto(nome, marca, categoria, codigo, partes);
        cadastro.cadastraProduto(produto);
    }
    
    private static void imprimeProduto(Produto produto){
        System.out.println("------------");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.println("Código de Barras: " + produto.getCodigo());
        System.out.println("Instruções de Descarte:");
        for (HashMap.Entry<String, Materiais> entrada : produto.getPartes().entrySet()) {
            System.out.println("- " + entrada.getKey() + " -> " + entrada.getValue());
        }
    }
    
    private static void imprimeProdutos(Cadastro cadastro){
        HashSet<Produto> produtos = cadastro.getProdutos();
        
        for (Produto item : produtos){
            imprimeProduto(item);
        }
    }
}
