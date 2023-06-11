public class DemoStringBuffer2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "pool", "jerk", "keep"};

        System.out.println(join(arr));
    }

    public static String join(String[] arr){
        // StringBuffer 实现元数的拼接
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                stringBuffer.append(arr[i]+"]");
            }else {
                stringBuffer.append(arr[i]+",");
            }
        }
        String s = stringBuffer.toString();
        return s;
    }
}
