package org.example.jdk.homework.four;

public class Menu {

    EmployeeOperations operations = new EmployeeOperations();
    private UserInterface userInterface = new UserInterface();

    public void run() {

        while (true) {
            switch (userInterface.inputAction()) {
                case 1 -> operations.addEmployee();
                case 2 -> operations.findEmployeeByExperience();
                case 3 -> operations.findPhonesByName();
                case 4 -> operations.findEmployeeByIDNumber();
                case 5 -> operations.addPhone();
                case 0 -> System.exit(0);
            }
        }
    }
}
