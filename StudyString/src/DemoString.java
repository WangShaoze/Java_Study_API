/*
* 字符串是比较特殊的数据类型
* 直接输出是输出对象，输出的是其中的字符串数据
*
* */

public class DemoString {
    public static void main(String[] args) {
        String s1 = new String("hello");
        System.out.println("s1:"+s1);

        char[] chars = {'w', 'o', 'r', 'l', 'd'};
        String s2 = new String(chars);
        System.out.println("s2:"+s2);

        String s3 = new String(chars, 0, 3);
        System.out.println("s3:"+s3);

        String s4 = "hello world";
        System.out.println("s4:"+s4);
    }
}
