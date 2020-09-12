public class IdentificaMaior {
    public static void main(String[] args) {
        int valorA, valorB;

        // Identificando se há valores no vetor args
        if (args.length > 1) {

            valorA = Integer.parseInt(args[0]);
            valorB = Integer.parseInt(args[1]);

            // Identificando o maior valor
            if (valorA > valorB) {
                System.out.println(valorA + " é o maior.");
            } else {
                System.out.println(valorB + " é o maior.");
            }

        } else {
            System.out.println("Deve ser informado dois valores inteiros.");
        }
    }
}