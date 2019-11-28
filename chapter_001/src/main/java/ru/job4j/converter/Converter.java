package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int rubleEuro = euroToRuble(140);
        int rubleDollar = dollarToRuble(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 euro are " + rubleEuro + " rubles.");
        System.out.println("140 dollars are " + rubleDollar + " rubles.");

        int inTestRubleToEuro = 140;
        int expectedTestRubleToEuro = 2;
        int outRubToEur = rubleToEuro(inTestRubleToEuro);
        boolean passedTestRubToEur = expectedTestRubleToEuro == outRubToEur;
        System.out.println("140 rubles are 2. Test result is: " + passedTestRubToEur);

        int inTestRubleToDollar = 140;
        int expectedTestRubleToDollar = 2;
        int outRubToDol = rubleToDollar(inTestRubleToDollar);
        boolean passedTestRubToDol = expectedTestRubleToDollar == outRubToDol;
        System.out.println("140 rubles are 2. Test result is: " + passedTestRubToDol);

        int inEuroToRuble = 140;
        int expectTestEuroToRuble = 9800;
        int outEuroToRuble = euroToRuble(inEuroToRuble);
        boolean passedTestEuroToRuble = expectTestEuroToRuble == outEuroToRuble;
        System.out.println("140 euro are 9800. Test result is: " + passedTestEuroToRuble);

        int inDollarToRuble = 140;
        int expectTestDollarToRuble = 8400;
        int outTestDollarToRuble = dollarToRuble(inDollarToRuble);
        boolean passedTestDollarToRuble = expectTestDollarToRuble == outTestDollarToRuble;
        System.out.println("140 dollar are 8400. Test result is: " + passedTestDollarToRuble);
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int rubleToEuro(int value) {
        return value / 70;
    }
}
