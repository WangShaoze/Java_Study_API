import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoStudentInfoTOLocal {
    public static void main(String[] args) throws IOException {
        // 集合
        ArrayList<Student> students = new ArrayList<>();

        addStudent(students);

        // 输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Students.txt"));

        // 遍历写入
        for (int i = 0; i < students.size(); i++) {
            StringBuffer stringBuffer = new StringBuffer();
            Student s = students.get(i);
            stringBuffer.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getGender());
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    private static void addStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true){
            System.out.println("请输入学生的学号:");
            id = scanner.nextLine();
            boolean flag=true;
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (id.equalsIgnoreCase(s.getId())){
                    flag=false;
                    break;
                }
            }
            if (flag){
                break;
            }else {
                System.out.println("该学号已经被占用了！！");
            }
        }
        System.out.println("请输入学生的姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入学生的年龄:");
        String age = scanner.nextLine();
        System.out.println("请输入学生的性别:");
        String gender = scanner.nextLine();
        Student student = new Student(id,name, age, gender);
        if (students.add(student)){
            System.out.println("学生"+student.toString()+",  信息添加成功！");
        }
    }


}

class Student {
    private String id;
    private String name;
    private String age;
    private String gender;

    public Student() {
    }

    public Student(String id, String name, String age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student  " +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", age: '" + age + '\'' +
                ", gender: '" + gender;
    }
}
