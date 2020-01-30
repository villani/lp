package lp;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Este exemplo contém a implementação de diversas rotinas que manipulam cadeias
 * de caracteres
 * (<a href="https://github.com/villani/lp/blob/master/src/lp/Exemplo51_ManipulandoCadeias2.java" target="_blank">Ver
 * código</a>).
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo51_ManipulandoCadeias2 {

    /**
     * Executa as sub-rotinas implementadas na classe.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        //item01();
        //item04();
        //item03();
        //item05();
        String frase = " essa é uma frase com espaços ";
        char letra = frase.trim().substring(5).toUpperCase().charAt(7);
        System.out.println("Letra: " + letra);

    }

    /**
     * Calcula e exibe a quantidade de vogais em uma frase.
     */
    public static void item01() {

        // CAPTUREI A FRASE DO USUARIO
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        // DEIXEI TODOS OS CARACTERES EM MINUSCULO
        frase = frase.toLowerCase();

        // DEFINI UM CONTADOR DE VOGAIS
        int cont = 0;

        // COMPAREI CARACATER POR CARACTER COM CADA VOGAL
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e'
                    || caractere == 'i' || caractere == 'o'
                    || caractere == 'u') {
                cont++;
            }
        }

        // APRESENTEI O RESULTADO DA CONTAGEM NO FINAL
        JOptionPane.showMessageDialog(null, "Qtde vogais: " + cont);
    }

    /**
     * Criptografa uma frase, substituindo as vogais por '*'.
     */
    public static void item03() {

        // CAPTUREI A FRASE DO USUARIO
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        // DEIXANDO TUDO EM MINÚSCULO
        frase = frase.toLowerCase();

        // DEFININDO CARACTERES QUE SERÃO SUBSTITUIDOS POR *
        String vogais = "aeiou";

        // COMPARANDO CARACTERE POR CARACTERE
        for (int i = 0; i < vogais.length(); i++) {
            char vogal = vogais.charAt(i);

            // MÉTODO QUE SUBSTITUI UM CARACTERE POR OUTRO
            frase = frase.replace(vogal, '*');
        }

        // MOSTRANDO FRASE "CRIPTOGRAFADA"
        JOptionPane.showMessageDialog(null, frase);

    }

    /**
     * Exibe, em ordem alfabética, as palavras de uma frase.
     */
    public static void item04() {

        // CAPTUREI A FRASE DO USUARIO
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        // REMOVI OS ESPAÇOS EM BRANCO DO INICIO E FINAL DA FRASE
        frase = frase.trim();

        // QUEBREI A CADEIA USANDO O ESPAÇO EM BRANCO COMO DELIMITADOR
        String[] palavras = frase.split(" ");

        // ORDENEI O VETOR DE PALAVRAS
        Arrays.sort(palavras); // import java.util.Arrays;

        // MOSTREI A FRASE ORDENADA
        frase = "";
        for (String palavra : palavras) {
            frase += palavra + " "; // JUNTANDO AS PALAVRAS NOVAMENTE
        }
        JOptionPane.showMessageDialog(null, frase);

    }

    /**
     * Deixa em maiúsculo a primeira letra das palavras de uma frase.
     */
    public static void item05() {

        // CAPTUREI A FRASE DO USUARIO
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        // COLOCANDO CADA PALAVRA COMO ELEMENTO DE UM VETOR
        String[] palavras = frase.split(" ");

        // TRABALHANDO COM CADA PALAVRA DA FRASE
        frase = "";
        for (String palavra : palavras) {

            // OBTENDO A PRIMEIRA LETRA E DEIXANDO-A EM MAIÚSCULA
            String letra = palavra.substring(0, 1).toUpperCase();

            // TROCANDO A PRIMEIRA LETRA PELA LETRA MAIÚSCULA
            palavra = letra + palavra.substring(1);

            // INSERINDO A PALAVRA NA FRASE NOVAMENTE
            frase += palavra + " ";
        }

        JOptionPane.showMessageDialog(null, frase);
    }

}
