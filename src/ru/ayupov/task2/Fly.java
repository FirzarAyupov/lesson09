package ru.ayupov.task2;

public interface Fly {

    default void fly() {
        System.out.println("Я умею летать");
    }
}
