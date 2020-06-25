package ru.ayupov.task3;

public class Adult extends Human {

    public Adult() {
        super("Взрослый");
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
