import java.util.Scanner;

public class DemoStringBuffer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = scanner.nextLine();
        System.out.println("你输入的["+s+"]是:"+isSymmetry(s));

    }

    public static boolean isSymmetry(String s){
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        String s1 = stringBuffer.toString();
        if (!s.equals(s1)){
            return false;
        }
        return true;
    }
}
