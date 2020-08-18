import java.util.Scanner;

public class CadastrarImovel {

    public static void main(String[] args) throws Exception {
        
        // Definir objeto para entrada de dados.
        Scanner in = new Scanner(System.in);

        // Definir um objeto Imóvel.
        Imovel im = new Imovel();

        // Obter do usuário os dados do imóvel.
        System.out.print("Informe o id do imóvel: ");
        im.id = Integer.parseInt(in.nextLine());
        
        System.out.print("Informe o tipo do imóvel: ");
        im.tipo = in.nextLine();
        
        System.out.print("Informe o bairro do imóvel: ");
        im.bairro = in.nextLine();

        System.out.print("Informe o valor do imóvel: ");
        im.valor = in.nextDouble();
        
        in.close();

        // Gravar os dados do imóvel no arquivo 'imóveis.csv'.
        im.gravar();

        System.out.println("Dados do imóvel gravados no arquivo.");

    }
    
}