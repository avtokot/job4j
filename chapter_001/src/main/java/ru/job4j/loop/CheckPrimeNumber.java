package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = true;
        for (int i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        System.out.println(checkPrimeNumber.check(7));
    }
}
