package ru.mirea.lab5.n4;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame {

    private final Image[] frames;  // Массив изображений кадров анимации
    private int currentFrameIndex;  // Индекс текущего кадра

    public Animation() {
        setTitle("Окошко с танцующим котиком");
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Загрузка кадров анимации
        frames = new Image[2];  // Здесь предполагается, что у вас есть 3 изображения кадров
        frames[0] = new ImageIcon("/Users/valeriavorobej/IdeaProjects/Uni/src/ru/mirea/lab5/n4/right1.jpeg").getImage();
        frames[1] = new ImageIcon("/Users/valeriavorobej/IdeaProjects/Uni/src/ru/mirea/lab5/n4/left.jpeg").getImage();
        //frames[2] = new ImageIcon("/Users/valeriavorobej/IdeaProjects/Uni/src/ru/mirea/lab5/n4/right2.jpeg").getImage();

        // Установка начального кадра
        currentFrameIndex = 0;

        // Создание и запуск таймера для переключения кадров анимации
        Timer timer = new Timer(350, e -> {
            currentFrameIndex = (currentFrameIndex + 1) % frames.length;
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Отрисовка текущего кадра анимации
        Image currentFrame = frames[currentFrameIndex];
        g2d.drawImage(currentFrame, 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Animation window = new Animation();
            window.setVisible(true);
        });
    }
}