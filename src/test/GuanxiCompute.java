package test;

public class GuanxiCompute {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        int c = 19,d =20;
        System.out.println("a && b = "+(a&&b));
        System.out.println("a || b = "+(a||b));
        System.out.println("!(a && b) = "+!(a&&b));
        int e = c>d ? c : d;
        boolean f = a&&b ? a : b;
        System.out.println( true?e:f);
        System.out.println( false?e:f);
    }
}
