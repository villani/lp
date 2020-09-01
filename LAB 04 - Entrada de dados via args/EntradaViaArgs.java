// Definindo o nome e o escopo do programa.
class EntradaViaArgs {

    // Definindo o método principal do programa.
    public static void main(String[] args) {

        // Verificando se algum valor foi informado por parâmetro.
        if (args.length > 0) {
            
            // Mostrando os valores informados.
            System.out.println("[0]: " + args[0]);
        } else {

            System.out.println("Nenhum valor foi informado.");
        }
    }

}