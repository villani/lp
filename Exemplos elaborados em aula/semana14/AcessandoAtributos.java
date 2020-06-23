public class AcessandoAtributos {
    
    public static void main(String[] args) {
        Imovel im1 = new Imovel();
        im1.bairro = "Boqueirão";

        System.out.println("Bairro: " + im1.bairro);

        Imovel[] imoveis = new Imovel[5];
        imoveis[0] = im1;
        System.out.println(imoveis[0].bairro);
        System.out.println(imoveis[1].bairro);
    }
}