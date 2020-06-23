public class VetorDeImoveis {

    public static void main(String[] args) {
        
        // Instanciar dois objetos do tipo Imovel.
        Imovel im1 = new Imovel();
        Imovel im2 = new Imovel();

        // Definir os valores de seus atributos.
        im1.id = 7;
        im1.tipo = "galpão";
        im1.bairro = "Real";
        im1.valor = 150000;

        im2.id = 8;
        im2.tipo = "loja";
        im2.bairro = "Mirim";
        im2.valor = 180000;

        // Armazená-los em um vetor.
        Imovel[] imoveis = new Imovel[2];
        imoveis[0] = im1;
        imoveis[1] = im2;

        // Usar o vetor para exibir os dados de cada objeto.
        for (int i = 0; i < imoveis.length; i++) {
            System.out.println("Imovel " + (i + 1) + ": " + imoveis[i].bairro);
        }

    }
    
}