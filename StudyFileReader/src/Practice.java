/*
* SRC：/home/xiowang/文档/msql80Study/23_temp_test.sql
* DST：23_temp_test.sql
*
* */

import java.io.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/msql80Study/23_temp_test.sql"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp_test.sql"));
//        // 复制文件
//        int ch;
//        while ((ch=bufferedReader.read())!=-1){
//            bufferedWriter.write(ch);
//        }
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        bufferedReader.close();

        // 一次复制一个字符数组
        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read(chars))!=-1){
            bufferedWriter.write(chars, 0, len);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
