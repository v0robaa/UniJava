package ru.mirea.lab12;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Shape {
    private Color color;
    private int xPos;
    private int yPos;

    public Shape(Color color, int xPos, int yPos) {
        this.color = color;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(xPos, yPos, 50, 50);
    }
}

public class RandomShape extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Shape[] shapes;

    public RandomShape() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(WIDTH - 50);
            int y = random.nextInt(HEIGHT - 50);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            shapes[i] = new Shape(color, x, y);
        }

        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomShape());
    }
}
