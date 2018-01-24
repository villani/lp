package lp;

/**
 * Este exemplo contém contém diversas manipulações que podem ser realizadas em
 * cadeias de caracteres.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo46_ManipulandoCadeias {

    /**
     * Cria e compara cadeias de caracteres e determina caracteres para serem
     * removidos da cadeia.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {

        // RESERVANDO UM ESPAÇO PARA GUARDAR CADEIAS DE CARACTERES
        String cadeia1;

        // CRIANDO A CADEIA E GUARDANDO NUM ESPAÇO 'cadeia2'
        String cadeia2 = "Palavra";

        // ANTIGO MÉTODO DE CRIAR CADEIA DE CARACTERES
        String cadeia3 = new String("Palavra"); // desnecessário
        // no Java 8

        // APONTANDO PARA A MESMA REFERÊNCIA
        cadeia1 = cadeia2;

        // COMPARAÇÃO DE REFERÊNCIAS
        if (cadeia1 == cadeia2) { // comparando referências
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        // COMPARAÇÃO DE CONTEÚDO
        if (cadeia2.equals(cadeia3)) { // comparando conteúdo
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

        // CRIANDO SUB-CADEIAS
        cadeia3 = "Leonardo";
        cadeia3 = cadeia3.substring(3);
        System.out.println("Resultado: " + cadeia3);

        // USANDO SOBRECARGA DO MÉTODO substring
        cadeia3 = "Leonardo";
        cadeia3 = cadeia3.substring(0, 3);
        System.out.println("Resultado: " + cadeia3);

        // USANDO A CLASSE StringBuffer
        // - Modifica a cadeia atual ao invés de criar uma
        // nova cadeia como na classe String.
        StringBuffer cadeia4 = new StringBuffer("Leonardo");
        cadeia4.delete(1, 4);
        System.out.println("* Resultado: " + cadeia4);

        // CONTANDO A QUANTIDADE DE LETRAS 'a' DE UMA PALAVRA
        cadeia3 = "Palmeiras";
        int cont = 0;
        for (int i = 0; i < cadeia3.length(); i++) {
            char letra = cadeia3.charAt(i);
            if (letra == 'a') {
                cont++;
            }
        }
        System.out.println("Qtde de A: " + cont);

    }

}
