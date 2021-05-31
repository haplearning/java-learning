import java.io.*;

public class Employe{
    String name;
    int age;
    String designation;
    double salary;

    public Employe(String name){
        this.name=name;
    }
    public void empAge(int age){
        this.age = age;
    }

    public void empDesign(String empDesign){
        designation=empDesign;
    }

    public void empSalary(double empSalary){
        salary=empSalary;
    }

    public void printEmploye(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("薪水："+salary);
    }
  
}

