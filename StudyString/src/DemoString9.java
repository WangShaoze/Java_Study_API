/*
* String 练习
* 按照指定的格式拼接将数组拼接成字符串
* int[] array = {1,2,4,3};   ----->  [1,2,4,3]
* */

public class DemoString9 {
    public static void main(String[] args) {
        int[] array = {1,2,4};
        System.out.println(toString(array));
        int[] array1 = {1,2,3,4};
        System.out.println(toString(array1));
    }

    public static String toString(int[] arr){
        String output = "";
        output += "[";
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                output += arr[i];
            }else {
                output += arr[i];
                output += ",";
            }
        }
        output += "]";
        return output;
    }
}
