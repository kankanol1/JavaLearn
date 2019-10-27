package test;

import java.io.*;

public class FileSteamClass {
    public static void main(String args[]) throws IOException{
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do {
            c= br.readLine();
            System.out.println(c);
        }while(!c.equals("end"));


    }
}
