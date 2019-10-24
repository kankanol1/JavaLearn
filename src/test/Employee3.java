package test;

public class Employee3 {
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public Employee3(String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args){
        Employee3 empOne = new Employee3("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(Employee2.DEPARTMENT);
        Logger myLogger = new Logger();
//        Logger.setFormat
    }
}
