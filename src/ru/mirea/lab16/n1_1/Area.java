package ru.mirea.lab16.n1_1;

import ru.mirea.lab16.n1.Numbers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Area extends JFrame {
    public Area() {
        setTitle("Область");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(150, 150);
        setLayout(new BorderLayout());

        // Верхняя панель (САО)
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.BLUE);
        northPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });
        add(northPanel, BorderLayout.NORTH);

        // Левая панель (ЗАО)
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.RED);
        westPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });
        add(westPanel, BorderLayout.WEST);

        // Центральная панель (ЦАО)
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GRAY);
        centerPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });
        add(centerPanel, BorderLayout.CENTER);

        // Правая панель (ВАО)
        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GREEN);
        eastPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });
        add(eastPanel, BorderLayout.EAST);

        // Нижняя панель (ЮАО)
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.ORANGE);
        southPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
            }
        });
        add(southPanel, BorderLayout.SOUTH);

        // Отображение окна
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Area area = new Area();
                area.setVisible(true);
            }
        });
    }
}

