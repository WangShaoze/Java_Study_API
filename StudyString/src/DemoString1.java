
/*
* String类的判断功能
* */
public class DemoString1 {
    public static void main(String[] args) {
        String s = "12fd32";
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s.endsWith("32"));
        System.out.println(s.startsWith("12"));
    }
}
