package test;

import java.util.Arrays;




public class ArraySortClass {
  /*  public static boolean equals(int[] a, int[] a2) {
        if (a==a2)//数组引用相等，则里面的元素一定相等
            return true;
        if (a==null || a2==null)//两个数组其中一个为null，都返回false
            return false;

        int length = a.length;
        if (a2.length != length)//两个数组长度不等，返回false
            return false;

        for (int i=0; i<length; i++)//通过for循环依次比较数组中每个元素是否相等
            if (a[i] != a2[i])
                return false;

        return true;
    }*/
    public static void main(String[] args){
        int[] num = {12,34,4,6,7,3};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        String[] str = {"a","m","b","c","d"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[a,b,c,d]
        System.out.println(Arrays.binarySearch(num,7));
        int[] num1 = {1,2,3};
        int[] num2 = new int[3];
        System.arraycopy(num1,0,num2,0,num1.length);
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.equals(num1,num2));
        String[][] name1 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
        String[][] name2 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
        System.out.println(Arrays.equals(name1,name2));// false
        System.out.println(Arrays.deepEquals(name1,name2));// true

        int[] fillNum = new int[10];
        Arrays.fill(fillNum,10);
        System.out.println(Arrays.toString(fillNum));
        System.out.println(Arrays.deepToString(name2));
    }
}
