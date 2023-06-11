import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("nis.txt"));

        // 一次读取一个字符
//        int ch;
//        while ((ch=bufferedReader.read())!=-1){
//            System.out.print((char) ch);
//        }
//        bufferedReader.close();
        // 一次读取一个字符数组

        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read(chars))!=-1){
            System.out.print(new String(chars, 0, len));
        }
        bufferedReader.close();

    }
}
