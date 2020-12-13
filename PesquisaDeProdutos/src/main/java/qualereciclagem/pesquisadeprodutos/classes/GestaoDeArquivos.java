
package qualereciclagem.pesquisadeprodutos.classes;

import java.io.*;
import java.util.HashSet;


public class GestaoDeArquivos {
    protected static boolean save(HashSet<Produto> produtos, String nomeArquivo) {//escreve o HashSet no arquivo
        if (produtos != null) {
            
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            
            try {
                fileOutputStream = new FileOutputStream(nomeArquivo);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);

                objectOutputStream.writeObject(produtos);
                
                objectOutputStream.flush();

                return true;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                  if (fileOutputStream != null) fileOutputStream.close();//evita erro caso o arquivo não tenha sido acessado ocm sucesso
                  if (objectOutputStream != null) objectOutputStream.close();//**
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    protected static HashSet<Produto> load(String nomeArquivo) {//retorna o HashSet do arquivo
        if(nomeArquivo != null) {

            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            try {
                File arquivo = new File(nomeArquivo);
                
                if (arquivo.length() == 0) {
                    return new HashSet<>();
                }
                
                fileInputStream = new FileInputStream(nomeArquivo);
                objectInputStream = new ObjectInputStream(fileInputStream);

                HashSet<Produto> produtos = (HashSet<Produto>) objectInputStream.readObject();

                return produtos;
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                try {
                  if (fileInputStream != null) fileInputStream.close();//evita erro caso o arquivo não tenha sido acessado ocm sucesso
                  if (objectInputStream != null) objectInputStream.close();//**
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new HashSet<>();
    }
}
