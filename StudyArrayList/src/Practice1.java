import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入学生的姓名:");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Q")){
                break;
            }
            System.out.println("请输入学生的年龄:");
            String age = scanner.nextLine();
            Student student = new Student(name, age);
            students.add(student);
        }

        System.out.println("学生集合 students:"+students.size()+" "+students);
        for (int i=0; i<students.size();i++){
            System.out.println(students.get(i).toString());
        }
    }
}
