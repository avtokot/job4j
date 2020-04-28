package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Bus going...");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Count passengers - " + count);
    }

    @Override
    public int gas(int countFuel) {
        int litreOfGasoline = 27;
        return litreOfGasoline * countFuel;
    }
}
