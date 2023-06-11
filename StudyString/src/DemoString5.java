/*
* 统计制定字符串中的大写小写字符及数字的个数
* */

import java.util.Scanner;

public class DemoString5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");

        String str = scanner.nextLine();
        int C_num = 0;
        int L_num = 0;
        int number_num = 0;
        for (int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            if (ch>'0'&&ch<'9'){
                number_num += 1;
            }else if (ch>'a'&&ch<'z'){
                L_num += 1;
            } else if (ch>'A'&&ch<'Z') {
                C_num += 1;
            }
        }
        System.out.println("大写字母的个数: "+C_num+"个，小写字母的个数: "+L_num+"个，数字的个数: "+number_num+"个。");
    }
}
