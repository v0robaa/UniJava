package ru.mirea.lab5.n3;
import javax.swing.*;

public class Picture {
    public static void main(String[] args) {
        String imagePath = "/Users/valeriavorobej/IdeaProjects/Uni/src/ru/mirea/lab5/n3/image.jpg";

        JFrame frame = new JFrame("Это окошко с котиком в очках");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        frame.getContentPane().add(imageLabel);
        frame.pack();
        frame.setVisible(true);
        };
    }



