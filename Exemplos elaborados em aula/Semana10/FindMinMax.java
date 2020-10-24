class FindMinMax {


  public static void main(String[] args) {
    double[] notas = {6, 7, 8};
    double[] notas2 = {4, 5, 7, 3, 7, 3, 7, 8, 10, 10};
    System.out.println("Média: " + calcularMedia(notas));
    System.out.println("Média: " + calcularMedia(notas2));
    double[] resp = findMinMax(notas2);
    System.out.println("Vetor: " + findMinMax(notas));
    System.out.println("Menor: " + resp[0]);
    System.out.println("Maior: " + resp[1]);
  }

  public static double calcularMedia(double[] notas) {
    double media = 0;
    for (int i = 0; i < notas.length; i++) {
      media += notas[i];
    }
    return (media / notas.length);
  }

  public static double[] findMinMax(double[] notas) {
    double[] minMax = new double[2]; 
    minMax[0] = notas[0];
    minMax[1] = notas[0];
    for (int i = 1; i < notas.length; i++) {
      if (notas[i] < minMax[0]) {
        minMax[0] = notas[i];
      }
      if (notas[i] > minMax[1]) {
        minMax[1] = notas[i];
      }
    }
    return minMax;
  }
}
