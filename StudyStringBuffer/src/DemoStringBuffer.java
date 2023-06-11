
public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello world");
        System.out.println(sb);

        sb.append(" Can you help me ?");
        sb.append(" Can you help me ?");
        sb.append(" Can you help me ?");
        StringBuffer stringBuffer = sb.append(" Can you help me ?");
        System.out.println(stringBuffer);
        System.out.println(sb==stringBuffer);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer sb1 = new StringBuffer();
        sb1.append("make you nile");
        sb1.append("pour peel");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        System.out.println(sb==sb1);

        sb1.append(" ");
        sb1.append(1);
        sb1.append(" ");

        sb1.append(14545);
        sb1.append(" ");
        sb1.append(false);
        sb1.append(" ");
        sb1.append(true);
        sb1.append(" ");

        System.out.println(sb1);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("ni hao").append(" ").append("poll").append(" ").append("land").append(" ").append("kill");
        System.out.println(stringBuffer1);

        stringBuffer1.reverse(); // 反转功能
        System.out.println(stringBuffer1);
    }
}
