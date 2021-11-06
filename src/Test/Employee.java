package Test;

import function.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//wwwwaaadexxxxxxw


     //   w4a3d1e1x6



public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Mary",18);
        Employee e5=new Employee("John",26);
        ArrayList<Employee> eList=new ArrayList<>();
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        eList.add(e4);
        eList.add(e5);
        Map<String, List<Employee>> gList= eList.stream().filter(i->i.age>18).collect(Collectors.groupingBy(i->i.name));

              System.out.println(gList);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
