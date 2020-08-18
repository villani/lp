public class UsaImovel {

    public static void main(String[] args) {
        
        // Instanciar um objeto do tipo Imovel e armazenar na varíavel obj1.
        Imovel obj1 = new Imovel();
        
        // Atribuindo valores aos campos (atributos) desse objeto.
        obj1.id = 6;
        obj1.tipo = "apartamento";
        obj1.bairro = "Guilhermina";
        obj1.valor = 270000;

        // Exibindo o valor de um dos atributos (bairro).
        System.out.println("Bairro: " + obj1.bairro);
    }
    
}