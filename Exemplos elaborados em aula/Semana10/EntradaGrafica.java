import javax.swing.JOptionPane;

class EntradaGrafica {
  public static void main(String[] args) {

    // OBTENDO DO USUÁRIO OS DADOS DE ENTRADA
    double p1, p2, p3;
    char tipo;
    p1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Prova 1:"));
    p2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Prova 2:"));
    p3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Prova 3:"));
    tipo = JOptionPane.showInputDialog(null, "Tipo de média:").charAt(0);
    String msg = "Aritmética: " + calcularMedia(p1, p2, p3, tipo);
    msg += "\nPonderada: " + calcularMedia(p1, p2, p3, 'p');

    JOptionPane.showMessageDialog(null, msg);
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
