package lp;

import java.io.File;

/**
 * Este exemplo contém propagação de todas as exceções que podem ser lançadas
 * durante a execução do método principal
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo54_PropagandoExcecoes.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo54_PropagandoExcecoes {

    /**
     * Cria ou verifica se já foi criado um determinado arquivo.
     *
     * @param args Não utiliza argumentos externos.
     * @throws Exception Se não for possível criar um determinado arquivo.
     */
    public static void main(String[] args) throws Exception { // Repassa possíveis exceções para o método chamador

        /*
         * Nesse caso, como main é o método responsável por chamar todos os 
         * outros métodos não há para quem repassar a exceção e o programa será
         * finalizado antecipadamente se algum problema ocorrer.
         */
        File arquivo = new File("meu-arquivo.txt");
        System.out.println("Arquivo já existe: " + arquivo.exists());
        System.out.println("O arquivo pode ser criado: " + arquivo.createNewFile());
        System.out.println("Arquivo já existe: " + arquivo.exists());

    }

}
