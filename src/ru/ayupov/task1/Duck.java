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

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }

    @Override
    public void run() {
        System.out.println("Я умею бегать");
    }

    @Override
    public void stopRun() { //  Для совместимости
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать");
    }

    @Override
    public void stopSwim() { //  Для совместимости
    }
}
