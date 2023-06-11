/*
 * SRC：/home/xiowang/文档/msql80Study/23_temp_test.sql
 * DST：23_temp_test.sql
 *
 * */

import java.io.*;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/msql80Study/23_temp_test.sql"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("23_temp_test.sql"));

        char[] chars = new char[1024];
        int len;
        while ((len= bufferedReader.read(chars))!=-1){
            bufferedWriter.write(chars,0,len);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
