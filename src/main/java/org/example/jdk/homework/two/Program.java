package org.example.jdk.homework.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    private final ArrayList<Developer> developers = new ArrayList<>();
    public void checkSpeciality() {

        developers.add(new FrontEndDeveloper());
        developers.add(new BackEndDeveloper());
        developers.add(new FrontEndDeveloper());

        for (Developer developer : developers) {
            if (developer instanceof FrontEndDeveloper) {
                ((FrontEndDeveloper) developer).developGUI();
            }
        }
    }
}

