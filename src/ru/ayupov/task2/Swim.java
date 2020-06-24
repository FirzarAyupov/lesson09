package ru.ayupov.task2;

public interface Swim {

    default void swim() {
        System.out.println("Я умею плавать");
    }

    ;

    default void stopSwim() {
        System.out.println("Не плыву");
    }
}
