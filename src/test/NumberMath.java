package test;

public class NumberMath {
    public static void main(String args[]){
        Integer x = 5;
        x =  x + 10;
        System.out.println(x);
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
        String c = "-35";
        System.out.println(Double.parseDouble(c));

        Double y = 5.0;
        System.out.println(y.equals(3.0));
        System.out.println(y.equals(5.0));
        System.out.println(y.equals(8.0));
        Double aa = Math.random()*100;
        System.out.println();

    }
}
