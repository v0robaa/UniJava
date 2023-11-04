package ru.mirea.lab16.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {
    private JTextArea textArea;

    public Text() {
        setTitle("Текстовый редактор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Создание текстовой области
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создание меню выбора цвета
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorMenuItemListener(Color.BLUE));
        redItem.addActionListener(new ColorMenuItemListener(Color.RED));
        blackItem.addActionListener(new ColorMenuItemListener(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Создание меню выбора шрифта
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontMenuItemListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontMenuItemListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontMenuItemListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        // Создание панели меню
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }

    private class ColorMenuItemListener implements ActionListener {
        private Color color;

        public ColorMenuItemListener(Color color) {
            this.color = color;
        }

        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontMenuItemListener implements ActionListener {
        private String fontName;

        public FontMenuItemListener(String fontName) {
            this.fontName = fontName;
        }

        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
            textArea.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Text example = new Text();
                example.setVisible(true);
            }
        });
    }
}
