import java.util.Scanner;

class EntradaTerminal {
  public static void main(String[] args) {

    // OBTENDO DO USUÁRIO OS DADOS DE ENTRADA
    Scanner in = new Scanner(System.in);
    double p1, p2, p3;
    char tipo;
    p1 = in.nextDouble();
    p2 = in.nextDouble();
    p3 = in.nextDouble();
    tipo = in.next().charAt(0);
    in.close();

    System.out.println("Aritmética: " + calcularMedia(p1, p2, p3, tipo));
    System.out.println("Ponderada: " + calcularMedia(p1, p2, p3, 'p'));
  }

  public static double calcularMedia(double p1, double p2, double p3, char tipo) {
    double media = 0;

    if (tipo == 'A' || tipo == 'a') {
      // média aritmética
      media = (p1 + p2 + p3) / 3;
    } else if (tipo == 'P' || tipo == 'p') {
      // média ponderada
      media = (p1*5 + p2*3 + p3*2) / (5+3+2);
    }


    return media;
  }
}