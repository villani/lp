import java.util.Arrays;

public class PropagarExcecao {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {5, 8, 13, 21};
        // try {
        //     int[] vetor3 = intercalarVetor(vetor1, vetor2);
        //     System.out.println(Arrays.toString(vetor3));
        // } catch (Exception e) {
        //     System.out.println("Erro: [" + e.getMessage() + "]");
        // }
        int[] vetor3 = intercalarVetor(vetor1, vetor2);
    }

    // PROPAGANDO A EXCEÇÃO PARA QUE OUTRO MÉTODO FAÇA O TRATAMENTO DELA.
    public static int[] intercalarVetor(int[] v1, int[] v2) throws Exception {

        if (v1.length != v2.length) {

            // LANÇANDO UMA EXCEÇÃO.
            throw new Exception("Os vetores precisam ter o mesmo tamanho");
        }

        // Vetor resultante da intercalação
        int[] v3 = new int[v1.length + v2.length];
        int j = 0;

        for (int i = 0; i < v1.length; i++) {
            v3[j++] = v1[i];
            v3[j++] = v2[i];
        }
        return v3;
    }
}