package org.example.jdk.homework.four;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperations {

    private EmployeeCollection employeeCollection = new EmployeeCollection();
    private UserInterface userInterface= new UserInterface();

    /**
     * Метод добавления сотрудника
     */
    public void addEmployee() {
        System.out.println("Добавление контакта:\n");
        employeeCollection.add(
                new Employee(userInterface.inputID(),
                        new EmployeePhones().addPhone(userInterface.inputPhoneNumber()),
                        userInterface.inputName(), userInterface.inputExperience()));
    }

    /**
     * Метод вывода сотрудников по стажу
     */
    public void findEmployeeByExperience() {
        boolean flag = false;
        int findExperience = userInterface.inputExperience();
        List<Employee> resultArray = new ArrayList<>();
        for (int i = 0; i < employeeCollection.count(); i++) {
            if (employeeCollection.getEmployee(i).getExperience() == findExperience) {
                resultArray.add(employeeCollection.getEmployee(i));
                flag = true;
            }
        }

        if (flag) {
            for (Employee line : resultArray) {
                System.out.println(line);
            }
        } else System.out.printf("Сотрудник со стажем '%d лет' не найден", findExperience);
    }

    /**
     * Метод вывода номеров телефона сотрудника по имени
     */
    public void findPhonesByName() {
        System.out.println(findEmployeeByName().getPhonesNumber());
    }

    /**
     * Метод поиска сотрудника по табельному номеру
     */
    public void findEmployeeByIDNumber() {
        int findID = userInterface.inputID();
        try {
            for (int i = 0; i < employeeCollection.count(); i++) {
                if (employeeCollection.getEmployee(i).getIdNumber() == findID) {
                    System.out.println(employeeCollection.getEmployee(i));
                    break;
                }
            }
        } catch (RuntimeException e) {
            System.out.printf("Сотрудник с табельным номером" + findID + " не найден");
        }
    }

    /**
     * Метод добавления номера телефона
     */
    public void addPhone() {
        for (int i = 0; i < employeeCollection.count(); i++) {
            if (employeeCollection.getEmployee(i).equals(findEmployeeByName())) {
                employeeCollection.getEmployee(i).addPhone(userInterface.inputPhoneNumber());
                break;
            }
        }
    }

    /**
     * Метод поиска сотрудника по имени
     */
    public Employee findEmployeeByName() {
        String findName = userInterface.inputName();
        try {
            for (int i = 0; i < employeeCollection.count(); i++) {
                if (employeeCollection.getEmployee(i).getName().equals(findName)) {
                    return employeeCollection.getEmployee(i);
                }
            }
        } catch (RuntimeException e) {
            System.out.printf("Сотрудник с именем" + findName + " не найден");
        }
        return null;
    }
}
