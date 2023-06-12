import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DemoDataFromArrayListToLocal {
    public static void main(String[] args) throws IOException {
        // 创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        // 添加数据到集合
        arrayList.add("hello ");
        arrayList.add("world ");
        arrayList.add("Java ");
        arrayList.add("Python ");
        arrayList.add("C++ ");
        arrayList.add("programming ");

        // 创建缓冲输出刘对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("aa.txt"));
        for (int i=0;i<arrayList.size();i++){
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
