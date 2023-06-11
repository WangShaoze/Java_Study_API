/*
* StringBuffer <----互换----> String
* */
public class DemoStringBuffer1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello").append(" ").append("world");
        System.out.println(stringBuffer);
        String s = stringBuffer.toString();
        System.out.println("s:"+s);

        StringBuffer stringBuffer1 = new StringBuffer(s);
        stringBuffer1.append(" land ");
        stringBuffer1.append(" cool ");
        System.out.println("stringBuffer1: "+stringBuffer1);

    }
}
