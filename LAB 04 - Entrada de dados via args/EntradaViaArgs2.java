// Definindo o nome e o escopo do programa.
class EntradaViaArgs2 {

    // Definindo o método principal do programa.
    public static void main(String[] args) {

        // Verificando se algum valor foi informado por parâmetro.
        if (args.length > 0) {

            // EXIBINDO TODOS OS PARÂMETROS INFORMADOS
            int i = 0;
            // - Estrutura específica para vetores
            for (String arg : args) {

                // Mostrando os valores informados.
                System.out.println("[" + (i++) + "]: " + arg);
            }

            System.out.println(args[4]);

        } else {

            System.out.println("Nenhum valor foi informado.");
        }
    }

}