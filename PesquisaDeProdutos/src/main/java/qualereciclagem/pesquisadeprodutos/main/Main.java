
package qualereciclagem.pesquisadeprodutos.main;

import qualereciclagem.pesquisadeprodutos.classes.Cadastro;
import qualereciclagem.pesquisadeprodutos.classes.InterfaceDeUsuario;


public class Main {
    public static void main(String[] args){
        
        Cadastro cadastro = new Cadastro("produtos.txt");
        InterfaceDeUsuario iu = new InterfaceDeUsuario();

        boolean continua = true;
        
        while (continua){//chama a função até o usuário pedir para sair
            try{
                iu.exibeInterface(cadastro);//a função exibeInterface joga uma exceção quando o usuário quer sair
            }
            catch(Exception e){
                continua = false;
            }
        }
    }
}
