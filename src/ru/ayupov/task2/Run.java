package ru.ayupov.task2;

public interface Run {

    default void run() {
        System.out.println("Я умею бегать");
    }

    default void stopRun() {
        System.out.println("Не бегу");
    }

}
