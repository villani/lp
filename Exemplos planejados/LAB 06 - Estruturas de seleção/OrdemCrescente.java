import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c;

        // ENTRADA
        System.out.print("Informe um valor inteiro: ");
        a = in.nextInt();
        System.out.print("Informe outro valor inteiro: ");
        b = in.nextInt();
        System.out.print("Informe mais um valor inteiro: ");
        c = in.nextInt();
        in.close();

        // PROCESSAMENTO
        String saida = "";

        if (a < b && a < c) { // 'a' é o menor valor

            if (b < c) { // 'b' é o médio e 'c' é o maior valor

                saida = a + " - " + b + " - " + c;

            } else { // 'c' é o médio e 'b' é o maior valor

                saida = a + " - " + c + " - " + b;

            }

        } else if (b < a && b < c) { // 'b' é o menor valor

            if (a < c) { // 'a' é o médio e 'c' é o maior valor

                saida = b + " - " + a + " - " + c;

            } else { // 'c' é o médio e 'a' é o maior valor

                saida = b + " - " + c + " - " + a;

            }

        } else { // 'c' é o menor valor

            if (a < b) { // 'a' é o médio e 'b' é o maior valor

                saida = c + " - " + a + " - " + b;

            } else { // 'b' é o médio e 'a' é o maior valor

                saida = c + " - " + b + " - " + a;

            }

        }

        // SAÍDA
        System.out.println(saida);
    }
    
}