package org.example.jdk.homework.four;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePhones {

    public ArrayList<String> addPhone(String line) {
        ArrayList<String> phones = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(" ");
            while (rowScanner.hasNext()) {
                phones.add(rowScanner.next());
            }
        }
        return phones;
    }

    public String phonesToString(ArrayList<String> phones) {
        StringBuilder builder = new StringBuilder();
        for(String phone : phones) {
            builder.append(phone + " ");
        }
        String str = builder.toString();
        return str;
    }
}
