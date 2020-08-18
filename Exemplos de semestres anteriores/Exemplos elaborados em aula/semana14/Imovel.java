import java.io.File;
import java.io.FileWriter;

public class Imovel {
    
    public int id;
    public String tipo;
    public String bairro;
    public double valor;
    
    public void gravar() throws Exception {
        File csv = new File("imoveis.csv");
        FileWriter escritor = new FileWriter(csv, true);
        escritor.write(id + "," + tipo + "," + bairro + "," + valor + "\n");
        escritor.close();
    }
}