import java.util.Arrays;
import java.util.Random;

/**
 * Contribuição de:
 * 
 * @author Daniel Amorim
 */
public class Exercicio06c {
    public static void main(String[] args) {
        
        int vetorA[] = new int[5];
        int vetorPos[] = new int[5];
        int vetorNeg[] = new int[5];
        Random gerador = new Random();
        
 
        for (int i = 0; i < vetorA.length; i++) { 
            vetorA[i] = gerador.nextInt(201) - 100;
 
        }

        // Contador para cada vetor
        int iPos = 0;
        int iNeg = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] >= 0) {
                vetorPos[iPos++] = vetorA[i];
            }else{
                vetorNeg[iNeg++] = vetorA[i];
            }
        }
        System.out.println("Valor do vetor principal: " + Arrays.toString(vetorA));
        System.out.println("Valores positivos: " + Arrays.toString(vetorPos));
        System.out.println("Valores negativos: " + Arrays.toString(vetorNeg));
    }
}
