package test;
import java.util.Arrays;
import java.util.List;
public class ArrayClass {
    public static void printArray(double[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static double[] reverse(double[] list){
        double[] result = new double[list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args){
        int size = 20;
        double[] myList = new double[size];
        for(int i=0;i<size;i++){
            myList[i] =i;
//            System.out.println(myList[i]);
        }
        double total = 0;
        for(double x:myList){
            total = total + x;
        }
        double max = myList[0];
        for(double x:myList){
            max = x>max?x:max;
        }
//        System.out.println(max+","+total);
        //printArray(myList);//打印数组
        //printArray(reverse(myList));//反转然后打印数组
        String str[][] = new String[5][6];
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                str[i][j]= i+"-"+j+",";
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
               System.out.print(str[i][j]);
            }
            System.out.print("\n");
        }
        String[] strA = {"a","b","c"};

        List listStr = Arrays.asList(strA);
        listStr.set(1,"kankan");
        System.out.println(listStr);
        listStr.add("a");


    }
}
