package ru.mirea.lab2.n2;

import ru.mirea.lab2.n2.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball test_ball = new Ball(4, 5);
        System.out.println(test_ball);
        test_ball.setX(6);
        System.out.println(test_ball);
        test_ball.setXY(2, 1);
        System.out.println(test_ball);
        test_ball.move(-2,1.5);
        System.out.println(test_ball);
    }
}
