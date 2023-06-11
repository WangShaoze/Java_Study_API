/*
* String类的获取功能
* */

public class DemoString3 {
    public static void main(String[] args) {
        String s = new String("Hello world");

        System.out.println(s.length());

        System.out.println(s.charAt(3));
        System.out.println(s.charAt(7));

        System.out.println(s.indexOf("H"));
        System.out.println(s.indexOf("w"));

        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
        System.out.println(s.substring(2, 8));
    }
}
