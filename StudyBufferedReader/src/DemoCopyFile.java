/*
 * SRC：/home/xiowang/文档/msql80Study/23_temp_test.sql
 * DST：23_temp_test.sql
 *
 * */

import java.io.*;

public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("aa.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/msql80Study/23_temp_test.sql"));
        int ch;
        while ((ch=bufferedReader.read())!=-1){
            bufferedWriter.write(ch);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
