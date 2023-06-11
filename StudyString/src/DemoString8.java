/*
* String 类的去除字符串两端的空格
* String 类的按照指定子字符串分割字符串
*
* */

public class DemoString8 {
    public static void main(String[] args) {
        String s1 = "   hello--";
        String s2 = "---hello  ";
        String s3 = "   hello  ";

        System.out.println("---"+s1+"---");
        System.out.println("---"+s1.trim()+"---");
        System.out.println("---"+s2+"---");
        System.out.println("---"+s2.trim()+"---");
        System.out.println("---"+s3+"---");
        System.out.println("---"+s3.trim()+"---");

        String s4 = "can you give me a help";
        String[] strings = s4.split(" ");
        for (int i=1;i<strings.length;i++){
            System.out.println(strings[i]);
        }
        String s5 = "s1,s2,s3,s4,s5,s6";
        String[] strings1 = s5.split(",");
        for (int i=1;i<strings.length;i++){
            System.out.println(strings1[i]);
        }
    }
}
