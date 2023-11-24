package ru.mirea.lab5.n3;
import javax.swing.*;

public class Picture {
    public static void picOut(String path)
    {
        JFrame frame = new JFrame("Это окошко с котиком в очках");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(path);
        JLabel imageLabel = new JLabel(imageIcon);

        frame.getContentPane().add(imageLabel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        if (args.length > 0) { //путь к картинке указан в аргументах
            String path = args[0];
            picOut(path);
        } else {
            System.out.println("Укажите путь к картинке в аргументах командной строки.");
        }
    }
}


