package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<Employee> empList=new ArrayList<>();

    empList.add(new Employee(1,"Deepak",29));
    empList.add(new Employee(2,"Rahul",30));
        empList.add(new Employee(3,"Rahul",30));
        empList.add(new Employee(4,"Rahul Verma",30));
        empList.add(new Employee(5,"Rahul Singh",30));

        Map<String,Long> empCount=empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(empCount);
    }
}