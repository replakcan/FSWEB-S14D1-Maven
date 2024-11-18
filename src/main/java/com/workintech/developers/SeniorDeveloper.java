package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, int salary, String name) {
        super(id, salary, name);
    }

    @Override
    public void work() {
        System.out.println("SeniorDeveloper starts to working");
    }
}
