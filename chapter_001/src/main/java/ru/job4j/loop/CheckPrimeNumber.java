package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = true;
        if (num % 2 == 0) {
            prime = false;
        }
        return prime;
    }
}
