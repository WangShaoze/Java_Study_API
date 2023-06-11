/*
* String类----字符串的遍历
* */
public class DemoString4 {
    public static void main(String[] args) {

        String s = "abc";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));

        // for 遍历
        for (int i=0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }



}
