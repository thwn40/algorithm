package Programmers;

import java.lang.invoke.SerializedLambda;

abstract class Employee{
    int sabun;
    String name;

    abstract  int getSalary();

    void printEmployeeInfo() {
        System.out.println("사번 : " + sabun + ", 이름 : " + name + ", 봉급" + getSalary());
    }
}

class Permanent extends Employee{
    int getSalary(){
        return 100;
    }
}

class Salesman extends Permanent {
    int getSalary() {
        return 10 + super.getSalary();
    }
}

public class Ex_13 {


    public static void main(String[] args) {
        Employee one = new Permanent();
        Employee two = new Salesman();
        one.sabun =1 ;
        one.name = "lji";
        two.sabun = 2;
        two.name = "kcs";

        one.printEmployeeInfo();
        two.printEmployeeInfo();
    }
}
