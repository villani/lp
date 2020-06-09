public class ContarPalavras {

    public static void main(String[] args) {
        String frase = "Alunos de PQ da Fatec Praia Grande descobrem vacinas para o COVID-19";
        System.out.println("Palavras: " + contarPalavras(frase));
    }

    // DEFINE MÉTODO PARA CONTAR AS PALAVRAS DE UMA FRASE
    // - Receber por parâmetro a frase.
    public static int contarPalavras(String frase) {
    
        // - Quebrar a frase onde houver espaços " ".
        String[] palavras = frase.split(" ");

        // - Contar quantos pedaços se formou.
        // - Retorna a quantidade de pedaços contados.
        return palavras.length;
    }
}