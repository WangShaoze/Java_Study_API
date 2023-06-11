/*
* String类的转化功能
* */

public class DemoString6 {
    public static void main(String[] args) {
        String s = "can you help me to fit the function of you-ge";
        String s1 = " TO FIT THE FUNCTION O";

        char[] chars = s.toCharArray();
        System.out.println(chars);
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

        System.out.println(s.toUpperCase());

        System.out.println(s1.toLowerCase());

    }
}
