package ru.ayupov.task3;

/**
 * Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
 * Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
 */
public class Main {
    public static void main(String[] args) {

        Baby baby = new Baby();
        baby.getName();
        System.out.println("run");
        baby.run();
        System.out.println("stopRun");
        baby.stopRun();
        System.out.println("swim");
        baby.swim();
        System.out.println("stopSwim");
        baby.stopSwim();

        System.out.println();
        Adult adult = new Adult();
        adult.getName();
        System.out.println("run");
        adult.run();
        System.out.println("stopRun");
        adult.stopRun();
        System.out.println("swim");
        adult.swim();
        System.out.println("stopSwim");
        adult.stopSwim();

    }
}
