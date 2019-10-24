package test;
import java.text.DecimalFormat;
public class Float {
    public static void main (String []args){
       DecimalFormat df = new DecimalFormat("#0.00") ;
        double d1 = 2313.23956; //采用四舍五入
        double d2 = 0.0;
        double d3 = 212.0;
        df.format(d1);
        df.format(d2);
        df.format(d3);
        System.out.println(df.format(d1));
        System.out.println(df.format(d2));
        System.out.println(df.format(d3));

    }
}
