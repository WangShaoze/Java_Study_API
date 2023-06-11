/*
* String 练习
* 字符串反转
* */

import java.util.Scanner;

public class DemoString10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请收入你需要反转的字符串:");
        String s = scanner.nextLine();
        System.out.println("反转后的字符串:"+reverse(s));
        System.out.println("反转后的字符串:"+reverseA(s));
        System.out.println("反转后的字符串:"+reverseA2(s));
    }

    public static String reverse(String s){
        String output = "";
        for (int i=s.length()-1;i>=0;i--){
            output += s.charAt(i);
        }
        return output;
    }

    public static String reverseA(String s){
        char[] chars = s.toCharArray();

        String output = "";
        for (int i=chars.length-1;i>=0;i--){
            output += chars[i];
        }
        return output;
    }

    public static String reverseA2(String s){
        char[] chars = s.toCharArray();


        for (int start=0,end=chars.length-1;start<=end;start++,end--){
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
        }

        String s1 = new String(chars);
        return s1;
    }
}
