package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Matches one = new Matches();
        one.select(11);
    }

    public int select(int size) {
        int countPlayer = 0;
        while (size > 0) {
            System.out.print("Left matches - " + size);
            System.out.println();
            System.out.print("Enter your number - ");
            Scanner input = new Scanner(System.in);
            int select = Integer.parseInt(input.nextLine());
            size -= select;
            countPlayer++;
            System.out.println();
        }
        playerWinner(countPlayer);
        return size;
    }

    public String playerWinner(int count) {
        String result = (count % 2 == 0) ? "The first win!" : "The second win!";
        System.out.println(result);
        return result;
    }
}
