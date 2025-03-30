import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscreverEmTxt {
    public static void main(String[] args) throws Exception {
        // escrever no txt
        String caminhoArquivo = "arquivo.txt";
        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));

        escritor.write("Olá Mundo da Silva \n tudo bem?");

        escritor.close();
    }
}
