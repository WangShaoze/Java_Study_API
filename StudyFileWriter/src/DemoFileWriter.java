import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt");

        fw.write("中国人");
        fw.write("中国人");
        fw.write("中国人");
        fw.append('\n');
        fw.append('d');

        fw.append('\n');
        fw.append("disk");

        fw.flush();
        fw.close();
    }

}
