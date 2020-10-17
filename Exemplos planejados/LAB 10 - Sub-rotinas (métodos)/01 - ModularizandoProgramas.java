import java.util.Scanner;

import javax.swing.JOptionPane;

public class ModularizandoProgramas {

    public static void main(String[] args) {
        
        // Ativando um método.
        saudar();

        // Ativando um método com parâmetro.
        String n = "Leonardo";
        saudar(n);
        saudar("Jônatas");
        saudar("Luciana");
        String[] pessoas = {"Bolsonaro", "Temer", "Dilma"};
        for (String p: pessoas) {
            saudar(p);
        }

        // Ativando um método sem parâmetro e com retorno.
        double result = obterRaiz();
        System.out.println("Raiz: " + result);

        // Ativando um método com parâmetro e com retorno.
        System.out.println("Informe um valor inteiro: ");
        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine();
        double result2 = obterRaiz(entrada); // ativando o método
        System.out.println("Raiz 2: " + result2);
        in.close();

    }

    // Um método sem retorno e sem parâmetros de entrada - atua no contexto de ação.
    public static void saudar() {
        System.out.println("Olá programador.");
    }

    // Um método sem retorno e com parâmetros.
    public static void saudar(String nome) {
        System.out.println("Olá " + nome);
    }

    // Um método com retorno e sem parâmetros.
    public static double obterRaiz() {
        String entrada = JOptionPane.showInputDialog(null, "Informe um inteiro positivo: ");
        double inteiro = Double.parseDouble(entrada);
        return Math.sqrt(inteiro);
    }

    // Um método com retorno e com parâmetros.
    public static double obterRaiz(String inteiro) {
        double valor = Double.parseDouble(inteiro);
        return Math.sqrt(valor);
    }
    
}