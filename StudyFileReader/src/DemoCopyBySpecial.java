/*
 * SRC：/home/xiowang/文档/msql80Study/23_temp_test.sql
 * DST：23_temp_test.sql
 *
 * */

import java.io.*;

public class DemoCopyBySpecial {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =new BufferedReader(new FileReader("/home/xiowang/文档/msql80Study/23_temp_test.sql"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("target.sql"));

        String line;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
