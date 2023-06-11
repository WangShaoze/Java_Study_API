import java.util.Scanner;

/*
* 实现用户登陆
* */
public class DemoString2 {
    public static void main(String[] args) {
        String user = "admin";
        String pwd = "abc123";

        // 只能有3次登陆试错机会
        for (int i=0; i<3;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String input_user = scanner.nextLine();

            System.out.println("请输入密码:");
            String input_pwd = scanner.nextLine();

            if (user.equals(input_user) && pwd.equals(input_pwd)){
                System.out.println("登陆成功");
                break;
            }else {
                if (2-i==0){
                    System.out.println("你输入的用户名或密码被锁定，联系管理员");
                }else {
                    System.out.println("登陆失败，你还有"+(2-i)+"机会。");
                }
            }
        }
    }
}
