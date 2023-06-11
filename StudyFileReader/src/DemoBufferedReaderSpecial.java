import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReaderSpecial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("aa.sql"));

        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
