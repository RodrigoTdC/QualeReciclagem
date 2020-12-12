/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualereciclagem.pesquisadeprodutos.main;

import qualereciclagem.pesquisadeprodutos.classes.InterfaceDeUsuario;

/**
 *
 * @author rotos
 */
public class Main {
    public static void main(String[] args){
        boolean continua = true;
        
        while (continua){
            try{
                InterfaceDeUsuario.exibeInterface();
            }
            catch(Exception e){
                continua = false;
            }
        }
    }
}
