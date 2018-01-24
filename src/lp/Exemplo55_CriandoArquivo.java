package lp;

import java.io.File;

/**
 * Este exemplo cria ou verifica se já foi criado determinado arquivo ou pasta
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo55_CriandoArquivo.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo55_CriandoArquivo {

    /**
     * Cria ou verifica se já foi criado determinado arquivo ou pasta.
     *
     * @param args Nâo utiliza argumentos externos.
     * @throws Exception Se não for possível criar um determinado arquivo ou
     * pasta.
     */
    public static void main(String[] args) throws Exception {

        File arquivo = new File("meu-arquivo.txt");
        System.out.println("Arquivo já existe: " + arquivo.exists());
        System.out.println("O arquivo pode ser criado: " + arquivo.createNewFile());
        System.out.println("Arquivo já existe: " + arquivo.exists());

        File pasta = new File("Minha pasta");
        System.out.println("A pasta já existe: " + pasta.exists());
        if (pasta.exists()) {
            pasta.delete();
            System.out.println("A pasta foi excluída com sucesso!");
        } else {
            System.out.println("A pasta pode ser criada: " + pasta.mkdir());
            System.out.println("A pasta já existe: " + pasta.exists());
        }

    }

}
