package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, int salary, String name) {
        super(id, salary, name);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper starts to working");
    }
}
