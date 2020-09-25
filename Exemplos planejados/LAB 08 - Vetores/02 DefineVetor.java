class DefineVetor {

    public static void main(String[] args) {
        
        // Variável primitiva
        int num1 = 23;

        // Vetor - um conjunto de variáveis do mesmo tipo.
        int[] nums = {num1, 34, 56, 12, 78, 53, 89};

        // Iterando um vetor - Um iteração para cada elemento desse conjunto.
        for (int i = 0; i < nums.length; i++) {

            // Verificar se um número é par.
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i] + " é par.");
            } else {
                System.out.println(nums[i] + " é impar.");
            }
        }

    }
}