package ru.ayupov.task1;

public abstract class Animal {
    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void getName();
}