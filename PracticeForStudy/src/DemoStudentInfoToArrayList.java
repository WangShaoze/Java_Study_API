import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DemoStudentInfoToArrayList {
    public static void main(String[] args) throws IOException {
        // 创建集合对象
        ArrayList<Student> students = new ArrayList<>();

        // 读取文件Students.txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Students.txt"));
        String line;
        while ((line=bufferedReader.readLine())!= null){
            String[] info = line.split(",");
            Student s = new Student(info[0], info[1], info[2],info[3]);
            students.add(s);
        }
        bufferedReader.close();

        // 遍历集合
        System.out.println("学号\t\t姓名\t\t年龄\t\t性别");
        for (int i=0; i< students.size();i++){
            Student stu = students.get(i);
            System.out.println(stu.getId()+"\t\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getGender());
        }
    }
}
