package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] jDevs;
    private MidDeveloper[] midDevs;
    private SeniorDeveloper[] seniorDevs;


    public HRManager(int id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper jdev) {

        try {
            if (jDevs[index] == null) {
                jDevs[index] = jdev;
            } else {
                System.out.println("dolu gardas siraya gir");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper midDev) {
        try {
            if (midDevs[index] == null) {
                midDevs[index] = midDev;
            } else {
                System.out.println("dolu gardas siraya gir");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDev) {
        try {
            if (seniorDevs[index] == null) {
                seniorDevs[index] = seniorDev;
            } else {
                System.out.println("dolu gardas siraya gir");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found " + index);
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "jDevs=" + Arrays.toString(jDevs) +
                ", midDevs=" + Arrays.toString(midDevs) +
                ", seniorDevs=" + Arrays.toString(seniorDevs) +
                '}';
    }
}
