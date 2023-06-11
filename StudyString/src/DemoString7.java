import java.util.Scanner;

/*
* String转换功能的练习
* 将用户输入的字符串首字母大写，其余字母小写，不考虑其他字符
* */
public class DemoString7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要转换的字符串:");
        String s = scanner.nextLine();
        String s1 = s.substring(0, 1);
        String s2 = s1.toUpperCase();
        System.out.println(s2+s.substring(1).toLowerCase());

    }
}
