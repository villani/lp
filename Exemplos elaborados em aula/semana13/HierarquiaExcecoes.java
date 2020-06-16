public class HierarquiaExcecoes {

    public static void main(String[] args) {

        try {

            int[] vetor = new int[2];
            vetor[5] = 5;

            int dividendo = 20;
            int divisor = 0;

            int quociente = dividendo / divisor;
            
        } catch (ArrayIndexOutOfBoundsException aioobe) {

            System.out.println("Acesso de posição inexistente: [" + aioobe.getMessage() + "]");

        } catch (ArithmeticException ae) {

            System.out.println("Falha ao dividir: [" + ae.getMessage() + "]");

        } catch (Exception e) { // MÃE (CLASSE PAI) DE TODAS AS EXCEÇÕES

            System.out.println("Falha: [" + e.getMessage() + "]");

        }

        System.out.println("Final do programa");
    }
}