import java.io.FileWriter;
import java.io.IOException;

public class DemoFireWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a.txt", true);
        for (int i=0;i<5;i++){
            fileWriter.write("hello "+i+"world");
            fileWriter.write("\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
