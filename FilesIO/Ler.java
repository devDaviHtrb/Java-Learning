import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;


public class Ler {
    public static void main(String [] args){
        Path caminho = Path.of("dados2.txt");
        try {
            List<String> conteudo = Files.readAllLines(caminho);
            for( String linha : conteudo){
                System.out.println(linha);
            }
            
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("Erro ao ler: " + e.getMessage());
        }
    }
}
