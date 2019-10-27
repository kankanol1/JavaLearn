package test;

public class MethodsClass {
    public static int max(int a, int b) {
        int result;
        return a > b ? a : b;
    }

    public static int max(String str) {
        return str.length();
    }

    public static double max(double num1, double num2) {
        System.out.println("double");
        return num1 > num2 ? num1 : num2;
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for(int i=1;i<numbers.length;i++){
            result = numbers[i]>result? numbers[i]:result;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        class MyClass {
            int x;

            MyClass() {
                System.out.println(this.toString());
                x = 10;
            }
        }
        class Cake extends  Object{
            private int id;
            public Cake(int id){
                this.id = id;
                System.out.println(this.id);
            }
            protected  void finalize() throws java.lang.Throwable{
                super.finalize();
                System.out.println("Cake Object "+ id +" is disposed");
            }
        }
        double[] array = {23,1243,65,436,324,63,4,572434,1};
        printMax(array);
        Cake c1 = new Cake(23);
        c1=null;
        System.gc();


    }
}
