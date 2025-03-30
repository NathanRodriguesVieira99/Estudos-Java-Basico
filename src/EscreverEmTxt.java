import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EscreverEmTxt {
    public static void main(String[] args) throws Exception {
        // escrever no txt
        String caminhoArquivo = "C:\\Projetos VsCode\\Estudos java basico\\arquivo.txt";

        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));

        escritor.write("Olá Mundo da Silva \n tudo bem? kkkkkkjjjjjj");
        escritor.close();

        // ler o txt
        try (BufferedReader leitorDeArquivos = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitorDeArquivos.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitorDeArquivos.readLine();
            }
        } catch (Exception erro) {
            System.out.println("Erro ao ler");
            System.out.println(erro.getMessage());
        }
    }
}
