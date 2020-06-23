package ru.ayupov.task1;

import ru.ayupov.task2.Run;

public class Horse extends Animal implements Run {
    private String name = "Лошадь";

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void run() {
        System.out.println("Я умею бегать");
    }

    @Override
    public void stopRun() { //  Для совместимости
    }
}