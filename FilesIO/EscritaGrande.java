import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.IOException;




public class EscritaGrande {

    public static void main(String [ ] args){
        Path caminho = Path.of("dados2.txt");
        try(BufferedWriter bw = Files.newBufferedWriter(caminho)){
            for (int i=1; i<=1000000; i++){
                bw.write("Esta é a linha numero " + i);
                bw.newLine();
            }
        }catch(IOException e){
            System.err.println("Erro ao gravar com buffer"+ e);
        }
    }
    
}
