package ru.ayupov.task3;

public class Adult extends Human {
    private String name = "Взрослый";

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void run() {
        System.out.println("Я бегу");
    }

    @Override
    public void stopRun() {
        System.out.println("Не бегу");
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }

    @Override
    public void stopSwim() {
        System.out.println("Не плыву");
    }
}
