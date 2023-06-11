import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("nis.txt", true));

        bufferedWriter.write("Have do it.");
        bufferedWriter.flush();

        for (int i=0; i<10;i++){
            bufferedWriter.write("123456");
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
