import java.io.*;

public class EmployeTest{
    public static void main(String[] args) {
        Employe empOne = new Employe("runoob1");
        Employe empTwo = new Employe("runoob2");

        empOne.empAge(26);
        empOne.empDesign("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmploye();
    
        empTwo.empAge(21);
        empTwo.empDesign("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmploye();

    }
}