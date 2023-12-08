package org.example.jdk.homework.two;

public class FrontEndDeveloper extends Developer{

    @Override
    void drinkCoffee() {
        System.out.println("Frontend developer drinks coffee");
    }

    @Override
    void smoke() {
        System.out.println("Frontend developer is smoking");
    }


    public void developGUI() {
        System.out.println("Frontend developer creates GUI");
    }
}
