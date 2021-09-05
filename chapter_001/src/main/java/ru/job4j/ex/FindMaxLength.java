package ru.job4j.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Amazon", null, "Ebay", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max element " + max);
    }
}
