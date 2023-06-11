import java.io.*;

public class DemoFiveWaysCopyFile {
    public static void main(String[] args) throws IOException {
        tip();
        copy1();
        copy2();
        copy3();
        copy4();
        copy5();

    }

    private static void copy5() throws IOException {
        // BufferedReader BufferedWriter 提供的特殊方法 按行复制
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/Python学习笔记/Git学习.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Git学习4.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void copy4() throws IOException {
        // BufferedReader BufferedWriter 一次复制一个字符数组
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/Python学习笔记/Git学习.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Git学习3.txt"));

        char[] chars = new char[1024];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            bufferedWriter.write(chars, 0, len);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    private static void copy3() throws IOException {
        // BufferedReader BufferedWriter 一次复制一个字符
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/xiowang/文档/Python学习笔记/Git学习.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Git学习2.txt"));
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            bufferedWriter.write(ch);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedWriter.close();
    }

    private static void copy2() throws IOException {
        FileReader fileReader = new FileReader("/home/xiowang/文档/Python学习笔记/Git学习.txt");
        FileWriter fileWriter = new FileWriter("Git学习1.txt");
        // FileReader FileWriter 一次复制一个字符数组
        char[] chars = new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, len);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }

    private static void copy1() throws IOException {
        String clue = "FileReader FileWriter 一次复制一个字符";
        System.out.println(clue);
        FileReader fileReader = new FileReader("/home/xiowang/文档/Python学习笔记/Git学习.txt");
        FileWriter fileWriter = new FileWriter("Git学习.txt");

        int ch;
        while ((ch = fileReader.read()) != -1) {
            fileWriter.write(ch);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }

    private static void tip() {
        System.out.println("使用5种方式复制文本文件");

        /*
         * SRC: /home/xiowang/文档/Python学习笔记/Git学习.txt
         * DES: Git学习.txt
         * */

        // FileReader FileWriter 一次复制一个字符
        // FileReader FileWriter 一次复制一个字符数组
        // BufferedReader BufferedWriter 一次复制一个字符
        // BufferedReader BufferedWriter 一次复制一个字符数组
        // BufferedReader BufferedWriter 提供的特殊方法 按行复制
    }
}
