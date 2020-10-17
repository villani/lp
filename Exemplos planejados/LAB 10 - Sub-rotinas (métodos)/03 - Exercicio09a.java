import javax.swing.JOptionPane;

public class Exercicio09a {
    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog(null, "Informe um valor inteiro: ");
        int inteiro = Integer.parseInt(entrada);

        // Ativando o método.
        System.out.println("Positivo? " + verificarPositividade(inteiro));
    }

    // Defino método.
    public static int verificarPositividade(int valor) {
        int retorno = 0;
        if (valor > 0) retorno = 1;
        
        return retorno;
    }
}