package ru.ayupov.task1;

import ru.ayupov.task2.Run;

public class Horse extends Animal implements Run {
    private String name = "Лошадь";

    public Horse() {
        super("Лошадь");
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
