public class PassagemValorReferencia {
    public static void main(String[] args) {
        // Declarando dois vetores com um elemento
        int[] a = {2};
        int[] b = {2};

        // Ativando métodos.
        incrementar(a);     // A Referência do objeto

        b[0] = incrementar(b[0]);  // O valor da variável

        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);
    }

    /**
     * Acrescenta uma unidade ao valor do argumento recebido.
     * @param numero Valor que receberá o argumento. 
     * @return Valor com o incremento de uma unidade.
     */
    public static int incrementar(int numero) { // Recebe o valor da variável.
        return ++numero;
    }

    /**
     * Acrescenta uma unidade ao valor do elemento da primeira posição do vetor.
     * @param vetor Vetor com ao menos um elemento.
     * @return Vetor com o elemento da primeiro posição com o incremento de uma unidade.
     */
    public static int incrementar(int[] vetor) { // Recebe a referência para o objeto.
        return ++vetor[0];
    }
    
}