package ru.ayupov.task1;

import ru.ayupov.task2.Swim;

public class Shark extends Animal implements Swim {
    private String name = "Акула";

    @Override
    public void getName() {
        System.out.println(name);
    }
}
