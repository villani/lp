import java.io.File;
import java.io.IOException;

public class IdentificandoExcecoes {
    public static void main(String[] args) {
        
        int dividendo = 5;
        int divisor = 0;
        int quociente = -1;
        
        File arquivo = new File("/root/virus.exe");

        // PODE HAVER SOMENTE "UM" BLOCO "TRY"
        try { // TENTA EXECUTAR CÓDIGOS QUE PODEM LANÇAR EXCEÇÕES

            quociente = dividendo / divisor; // Pode lançar java.lang.ArithmeticException
            arquivo.createNewFile(); // Pode lançar java.io.IOException

        // PARA UM BLOCO "TRY" PODE HAVER QUANTOS BLOCOS "CATCHS" FOREM NECESSÁRIOS.
        } catch (ArithmeticException ae) {

            System.out.println("Falha na divisão: [" + ae.getMessage() + "]");

        } catch (IOException ioe) { // CAPTURA O TIPO DE EXCEÇÃO ESPECIFICADO

            System.out.println("Falha ao criar arquivo: [" + ioe.getMessage() + "]");

        } finally {
            // CONTÉM UMA AÇÃO NECESSÁRIA INDEPENDENTE DO FLUXO SE SEGUIR PARA UM BLOCO 
            // CATCH
        }

        System.out.println("Quociente: " + quociente);
    }
}