package ru.ayupov.task1;

/**
 * Написать абстрактный класс Animal с абстрактным методом getName. Сделать несколько классов животных,
 * наследников Animal. Метод getName должен выводит название каждого животного. *
 */

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.getName();

        Horse horse = new Horse();
        horse.getName();

        Shark shark = new Shark();
        shark.getName();
    }

}
