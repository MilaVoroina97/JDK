package org.example.jdk.homework.four;

public class Menu {

    EmployeeOperations actions = new EmployeeOperations();
    private UserInterface cv = new UserInterface();

    public void run() {

        while (true) {
            switch (cv.inputAction()) {
                case 1 -> actions.addEmployee();
                case 2 -> actions.findEmployeeByExperience();
                case 3 -> actions.findPhonesByName();
                case 4 -> actions.findEmployeeByIDNumber();
                case 5 -> actions.addPhone();
                case 0 -> System.exit(0);
            }
        }
    }
}
