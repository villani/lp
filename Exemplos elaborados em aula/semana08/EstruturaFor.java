class EstruturaFor {
    public static void main(String[] args) {
        int i = 0;
        for (
                i = 0;  // uma única vez, antes da  primeira iteração
                i < 5;      // todas vez, antes de qualquer iteração
                i++         // toda vez, ao final da realização de uma iteração
            ) {

            // Gerando números aleatórios
            // Casting explícito
            // - Conversão explícita de um valor para outro.Ex: double -> int
            int random = (int)(Math.random()*10)+1;

            // - Conversão implícita
            //double a = 2;
            //int b = (int)2.45;

            System.out.println(random);
        }
        System.out.println("i: " + i);
    }
}