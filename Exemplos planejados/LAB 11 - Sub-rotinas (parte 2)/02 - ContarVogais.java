public class ContarVogais {
    public static void main(String[] args) {
        String frase = "O palmeiras ganhou o mundial de 1950.";

        frase = frase.replace('a', '*');
        
        System.out.println(frase);

        System.out.println("Quantidade de caracteres: " + frase.length());
        int vogais = contarVogais2(frase);
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Contém? " + frase.contains("p"));
    }

    public static int contarVogais2(String frase) {
        frase = frase.toLowerCase();
        int count = 0;
        String vogais = "aeiouáéíóúàïüãõêô";
        for (int i = 0; i < frase.length(); i++) {
            char vogal = frase.charAt(i);
            if (vogais.contains(String.valueOf(vogal))) count++;
        }
        return count;
    }
    public static int contarVogais(String frase) {
        // Deixar todos os caracteres da frase em minúsculo.
        frase = frase.toLowerCase();

        // Definir todos os caracteres que devem ser comparados.
        String vogais = "aeiouáéíóúàïüãõêô";
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            for (int j = 0; j < vogais.length(); j++) {
                char vogal = vogais.charAt(j);
                if (c == vogal)
                    count++;
            }
        }
        return count;
    }
}