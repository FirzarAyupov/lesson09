package ru.ayupov.task3;

public class Adult extends Human {
    private String name = "Взрослый";

    @Override
    public void getName() {
        System.out.println(name);
    }
}
