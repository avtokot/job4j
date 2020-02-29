package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("He's nick is " + this.name + " and he's eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.println("There are gav's food");
        gav.giveNick("Pretty");
        gav.eat("Kotleta");
        gav.show();

        Cat black = new Cat();
        System.out.println("There are black's food");
        black.giveNick("Rock");
        black.eat("Fish");
        black.show();
    }
}
