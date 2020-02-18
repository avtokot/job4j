package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int num) {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (prime.check(i)) {
                count++;
            }
        }
        return count;
    }
}
