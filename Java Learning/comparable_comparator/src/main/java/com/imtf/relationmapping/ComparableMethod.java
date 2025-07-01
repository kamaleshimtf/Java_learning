package com.imtf.relationmapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String name;
    private Integer age;
    private Double salary;

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {}

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.getAge() - otherEmployee.getAge();
    }
}
class EmployeeData {
    private String name;
    private Integer age;
    private Double salary;

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeData(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public EmployeeData() {}
}
class EmployeeComparator implements Comparator<EmployeeData> {

    @Override
    public int compare(EmployeeData employeeOne, EmployeeData employeeTwo) {
      return employeeOne.getSalary().compareTo(employeeTwo.getSalary());
    }
}
public class ComparableMethod {
    public static void main(String[] args) {
        List<Employee> employeeDetails = new ArrayList<>();
        employeeDetails.add(new Employee("Alice", 22, 1000.00));
        employeeDetails.add(new Employee("Charlie", 20, 25000.00));
        employeeDetails.add(new Employee("Bob", 25, 20000.00));

        Collections.sort(employeeDetails);
        System.out.println("-------------comparable method----------------");
        for (Employee employee : employeeDetails) {
            System.out.println(employee.getName() +  " " + employee.getAge());
        }

        EmployeeComparator comparatorData = new EmployeeComparator();
        List<EmployeeData> employeeData = new ArrayList<>();
        employeeData.add(new EmployeeData("Alice", 22, 1000.00));
        employeeData.add(new EmployeeData("Charlie", 20, 25000.00));
        employeeData.add(new EmployeeData("Bob", 25, 20000.00));

        Collections.sort(employeeData,comparatorData);

        System.out.println("-------------comparator method----------------");
        for (EmployeeData employee: employeeData) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }
    }
}
