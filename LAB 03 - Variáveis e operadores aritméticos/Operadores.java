class Operadores {
  public static void trabalharOperadores() {
    int a = 5;
    int b = 2;
    var c = "2"; // o valor armazenado define o tipo da variável
    var d = '2';
    
    // Operadores aritméticos
    System.out.println(a + b);
    System.out.println(a + c); // concatenação
    System.out.println(a + d); // operando char, adição e NÃO concatenação
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b); // divisão de inteiros, resulta em inteiro
    System.out.println(a / 2.0);
    System.out.println(a % b); // obtém o resto da divisão
    System.out.println(a % 2.0); // obtém o resto da divisão
  }
}