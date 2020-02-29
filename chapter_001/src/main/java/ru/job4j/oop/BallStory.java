package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Hare hare = new Hare();
        fox.tryEat(ball);
        wolf.tryEat(ball);
        hare.tryEat(ball);
        ball.tryEscape(fox, hare, wolf);

    }
}
