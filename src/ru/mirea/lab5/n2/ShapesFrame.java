package ru.mirea.lab5.n2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapesFrame extends Canvas {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        spaint(g2);
    }

    public static void spaint(Graphics2D g) {
        Random rand = new Random();
        Color [] colors = {Color.ORANGE, Color.BLACK, Color.BLUE, Color.cyan, Color.pink, Color.DARK_GRAY};
        int k = rand.nextInt(10);
        Circle [] circle = new Circle[k];
        for (int i = 0; i < k; i ++) {
            circle[i] = new Circle(rand.nextInt(1000), rand.nextInt(800), colors[rand.nextInt(6)], rand.nextInt(200));
        }
        k = rand.nextInt(10);
        Rectangle [] rectangles = new Rectangle[k];
        for (int i = 0; i < k; i ++) {
            rectangles[i] = new Rectangle(rand.nextInt(1000), rand.nextInt(800), colors[rand.nextInt(6)], rand.nextInt(200), rand.nextInt(200));
        }
        k = rand.nextInt(10);
        Square [] square = new Square[k];
        for (int i = 0; i < k; i ++) {
            square[i] = new Square(rand.nextInt(1000), rand.nextInt(800), colors[rand.nextInt(6)], rand.nextInt(200));
        }

        for (Circle value : circle) {
            g.setColor(value.getColor());
            g.fillOval(value.getPosX(), value.getPosY(), value.getRad(), value.getRad());
        }
        for (Square value : square) {
            g.setColor(value.getColor());
            g.fillRect(value.getPosX(), value.getPosY(), value.getSide(), value.getSide());
        }
        for (Rectangle rectangle : rectangles) {
            g.setColor(rectangle.getColor());
            g.fillRect(rectangle.getPosX(), rectangle.getPosY(), rectangle.getSide1(), rectangle.getSide2());
        }
    }
    public static void main(String[] args) {
        ShapesFrame o = new ShapesFrame();
        JFrame frame = new JFrame();
        frame.add(o);
        frame.setSize(1000, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}