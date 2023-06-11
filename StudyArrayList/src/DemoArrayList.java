import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("xioWang", "12"));
        students.add(new Student("xioHua", "11"));
        students.add(new Student("xioWg", "12"));
        students.add(new Student("xioWa", "13"));

        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).toString());
        }

        for (int i=0;i<students.size();i++){
            Student student = students.get(i);
            System.out.println(student.getName()+": "+student.getAge());
        }


        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings);
        strings.add("hello");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("PHP");
        System.out.println(strings);
        strings.add(1,"world");
        System.out.println(strings);

        System.out.println(strings.size());

        System.out.println(strings.get(5));
        System.out.println(strings.get(2));

        strings.remove(0);
        strings.remove(0);
        System.out.println(strings);

        strings.set(strings.size()-1, "Ruby");
        strings.set(strings.size()-2, "PHP");
        System.out.println(strings);

        System.out.println(strings.contains("Python"));

        // 对集合进行遍历
        for (int i=0; i<strings.size();i++){
            String s = strings.get(i);
            System.out.println(s);
        }

        strings.clear();
        System.out.println(strings);
    }
}
