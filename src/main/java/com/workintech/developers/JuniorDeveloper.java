package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(int id, int salary, String name) {
        super(id, salary, name);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper starts to working");
    }
}
