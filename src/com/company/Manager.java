package com.company;

import java.util.ArrayList;

public class Manager extends Employee implements Management {

    // Atributs, constructor, mètodes...
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public void plan() {

    }

    public void hire(Employee e) {
        employeeList.add(e);
    }



}
