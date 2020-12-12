/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualereciclagem.pesquisadeprodutos.main;

import java.util.HashMap;
import qualereciclagem.pesquisadeprodutos.classes.Cadastro;
import qualereciclagem.pesquisadeprodutos.classes.InterfaceDeUsuario;
import qualereciclagem.pesquisadeprodutos.classes.Materiais;
import qualereciclagem.pesquisadeprodutos.classes.Produto;

/**
 *
 * @author rotos
 */
public class Main {
    public static void main(String[] args){
        
        Cadastro cadastro = new Cadastro("produtos.txt");
        InterfaceDeUsuario iu = new InterfaceDeUsuario();

        boolean continua = true;
        
        while (continua){//chama a função até o usuário pedir para sair
            try{
                iu.exibeInterface(cadastro);
            }
            catch(Exception e){
                continua = false;
            }
        }
    }
}
