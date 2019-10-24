package test;

public class StringBufferClass {
    public static void main(String args[]){
        StringBuffer sBuffer = new StringBuffer("冰原狼:");
        sBuffer.append("https://");
        sBuffer.append("kankan");
        sBuffer.append(".fun");
        System.out.println(sBuffer);
        System.out.println(sBuffer.reverse());
        System.out.println(sBuffer.delete(0,2));
        System.out.println(sBuffer.replace(0,3,"fanny"));
        System.out.println(sBuffer.reverse());
        System.out.println(sBuffer.indexOf("kan"));
        int a = 2345;
        System.out.println(sBuffer.toString());


    }
}
