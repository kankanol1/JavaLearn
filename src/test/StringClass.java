package test;

public class StringClass {
    public static void main(String args[]){
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );
        String Str = new String("www.runoob.com");
        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)google(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("www(.*)"));


    }
}
