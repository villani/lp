package lp;

import java.io.File;

/**
 * Este exemplo obtém informações de determinadas pastas. 
 *
 * @author Prof. Me. Leonardo Villani
 */
public class ManipulaDiretorio {

    /**
     * Obtém informações de pastas e de respectivos sub-pastas ou arquivos.
     *
     * @param args Não utiliza argumentos externos.
     * @throws Exception Se um arquivo ou pasta não puder ser criado ou não
     * houver permissão para acessá-los.
     */
    public static void main(String[] args) throws Exception {

        File pastaAtual = new File(".");

        // Obtendo informações do arquivo
        System.out.println("pastaAtual é um arquivo: " + pastaAtual.isFile());
        System.out.println("pastaAtual é um diretório: " + pastaAtual.isDirectory());
        System.out.println("Caminho completo: " + pastaAtual.getAbsolutePath());
        System.out.println("Caminho canônico: " + pastaAtual.getCanonicalPath());
        File pasta01 = new File("pasta01");
        pasta01.mkdir();

        // Obtendo conteúdo do diretório
        String[] conteudo = pastaAtual.list();
        System.out.println();
        for (String item : conteudo) {
            System.out.println(item);
        }

        File pastaFilha = new File(pasta01.getCanonicalPath() + File.separator + "pastaFilha");
        pastaFilha.mkdir();
        System.out.println("CONTEÚDO DA PASTA: " + pasta01.getName());
        for (String subpastas : pasta01.list()) {
            System.out.println(subpastas);
        }

    }

}
