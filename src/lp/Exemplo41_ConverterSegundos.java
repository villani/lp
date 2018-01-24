package lp;

import java.util.Scanner;

/**
 * Este exemplo contém a implementação de um segundo método dentro da mesma
 * classe, usado para converter segundos em horas, minutos e segundos.
 *
 * @author Prof. Me. Leonardo Villani
 */
public class Exemplo41_ConverterSegundos {

    /**
     * Obtém do usuário o tempo em segundos e executa um segundo método para
     * converter esse tempo em horas, minutos e segundos.
     *
     * @param args Não utiliza argumentos externos.
     */
    public static void main(String[] args) {
        int segundos;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe os segundos: ");
        segundos = leitor.nextInt();
        System.out.println(converteTempo(segundos));
    }

    /**
     * Converte segundos em horas, minutos e segundos.
     * 
     * @param seg Tempo em segundos.
     * @return O tempo convertido em horas, minutos e segundos.
     */
    public static String converteTempo(int seg) {
        int horas, minutos, resto;
        horas = seg / 3600;
        resto = seg % 3600;
        minutos = resto / 60;
        seg = resto % 60;
        return horas + "h, " + minutos + "min e " + seg + "seg.";
    }

}
