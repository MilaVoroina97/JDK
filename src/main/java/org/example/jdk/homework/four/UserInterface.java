package org.example.jdk.homework.four;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserInterface {

    Scanner in;
    public UserInterface() {
        in = new Scanner(System.in, StandardCharsets.UTF_8);
    }

    public int inputID() {
        System.out.print("Введите табельный номер: ");
        return in.nextInt();
    }

    public String inputPhoneNumber() {
        System.out.print("Введите номер телефона: ");
        return in.next();
    }

    public String inputName() {
        System.out.print("Введите имя: ");
        return in.next();
    }

    public int inputExperience() {
        System.out.print("Введите стаж: ");
        return in.nextInt();
    }

    public int inputAction() {
        System.out.println("1 - Добавить сотрудника");
        System.out.println("2 - Вывести сотрудников по стажу");
        System.out.println("3 - Вывести номер телефона сотрудника по имени");
        System.out.println("4 - Найти сотрудника по табельному номеру");
        System.out.println("5 - Добавить номер телефона");
        System.out.println(" 0 - Выход из программы");
        System.out.print("Введите действие: ");
        return in.nextInt();
    }
}
