class Variaveis {
  public static void declararVariaveis() {

    // Definindo o tipo da variável pelo valor atribuído.
    var x = "Leonardo";
    
    // x = 12; - Ha variável espera uma String.

    // Definindo previamente o tipo da variável.
    int inteiro = 12; //(32 bits), long (64 bits), short (16 bits) , byte (8 bits)
    double real = 12.7;
    boolean booleano = true;
    byte inteiro2 = 127; // -128 .. -1 e 0 .. 127
    char caractere = 'L';
    String texto = "java";


    System.out.println(x);
    System.out.println(inteiro);

    // Tipos Wrappers
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);

  }
}