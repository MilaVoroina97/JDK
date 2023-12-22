package org.example.jdk.homework.four;

import java.util.ArrayList;



public class Employee {
    private int idNumber;
    private ArrayList<String> phonesNumber;
    private String name;
    private int experience;

    public Employee(int idNumber, ArrayList<String> phonesNumber, String name, int experience){

        this.idNumber = idNumber;
        this.phonesNumber = phonesNumber;
        this.name = name;
        this.experience = experience;

    }


    public boolean addPhone(String phoneNumber) {
        boolean flag = false;
        if (!phonesNumber.contains(phoneNumber)) {
            phonesNumber.add(phoneNumber);
            flag = true;
        }
        return flag;
    }
}
