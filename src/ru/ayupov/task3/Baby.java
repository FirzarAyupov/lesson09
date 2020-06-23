package ru.ayupov.task3;

public class Baby extends Human {
    private String name = "Младенец";

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void run() {
        System.out.println("Я еще даже ходить не умею");
    }

    @Override
    public void stopRun() {
        System.out.println("Не бегу");
        run();
    }

    @Override
    public void swim() {
        System.out.println("Я не умею плавать");
        run();
    }

    @Override
    public void stopSwim() {
        System.out.println("Не плыву");
        swim();
    }

}
