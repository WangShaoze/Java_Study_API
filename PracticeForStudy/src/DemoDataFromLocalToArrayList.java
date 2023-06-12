import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DemoDataFromLocalToArrayList {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("aa.txt"));

        String line;
        while ((line=bufferedReader.readLine())!=null){
            arrayList.add(line);
        }
        bufferedReader.close();

        for (int i=0;i<arrayList.size();i++){
            String s=arrayList.get(i);
            System.out.println(s);
        }
    }
}
