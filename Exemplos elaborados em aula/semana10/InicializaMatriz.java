public class InicializaMatriz {

    public static void main(String[] args) {
        
        // Declarar uma matriz.
        int[][] a;
        //a[0][1] = 2; // é necessário inicializar a matriz.

        // Declarar e inicializar com os valores padrões uma matriz.
        int[][] b = new int[3][3];
        b[0][1] = 2;

        // Declarar e inicializar com valores predefinidos uma matriz.
        int[][] c = { {1,2,3}, {4,5,6}, {7,8,9}};
        int[][] d = { 
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };
        // Acessando um elemento da matriz.
        System.out.println("d[1][2]: " + d[1][2]);

        // Exibindo todos os elementos da matriz.
        for (int[] linha: b) {
            for (int elemento: linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println(); // Quebra linha.
        }
    }  
}