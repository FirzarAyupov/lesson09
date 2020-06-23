package ru.ayupov.task2;

import ru.ayupov.task1.Duck;
import ru.ayupov.task1.Horse;
import ru.ayupov.task1.Shark;
import  ru.ayupov.task2.Fly;
import  ru.ayupov.task2.Run;
import  ru.ayupov.task2.Swim;

/**
 * Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
 * Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
 * Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
 */
public class Main {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.getName();
        horse.run();

        Shark shark = new Shark();
        shark.getName();
        shark.swim();

        Duck duck = new Duck();
        duck.getName();
        duck.run();
        duck.swim();
        duck.fly();
    }
}
