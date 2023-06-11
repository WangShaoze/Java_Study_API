import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriteSpecial {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("aa.sql"));
        bufferedWriter.write("select * from 003154csv");
        bufferedWriter.newLine();   // 根据系统完成自动换行
        bufferedWriter.write("select * from 003154csv");
        for (int i=0; i<10;i++){
            bufferedWriter.newLine();
            bufferedWriter.write("select * from Chart"+(i+1));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
