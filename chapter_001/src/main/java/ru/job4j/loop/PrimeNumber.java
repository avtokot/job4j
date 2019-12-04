package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.calc(11));
    }
}
