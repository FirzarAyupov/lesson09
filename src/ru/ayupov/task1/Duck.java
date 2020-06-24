package ru.ayupov.task1;

import ru.ayupov.task2.Fly;
import ru.ayupov.task2.Run;
import ru.ayupov.task2.Swim;

public class Duck extends Animal implements Fly, Run, Swim {
    private String name = "Утка";

    @Override
    public void getName() {
        System.out.println(name);
    }

}
