package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator {
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Yoga Prudhvi",28,111000));
        employees.add(new Employee("Cristiano Ronaldo",37,11100000));
        employees.add(new Employee("Joshua Van",23,911000));

        System.out.println(employees);

        Collections.sort(employees,new EmployeeAgeAscendingComparator());
        System.out.println(employees);

        Collections.sort(employees,new EmployeeNameDescendingComparator());
        System.out.println(employees);





    }
}
