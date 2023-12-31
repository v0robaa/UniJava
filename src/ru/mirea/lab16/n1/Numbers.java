package ru.mirea.lab16.n1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Numbers extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private JButton guessButton;

    public Numbers() {
        setTitle("Игра-угадайка");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());


        // Панель с текстовым полем и кнопкой
        JPanel inputPanel = new JPanel();
        textField = new JTextField(10);
        guessButton = new JButton("Угадать");
        inputPanel.add(textField);
        inputPanel.add(guessButton);
        add(inputPanel, BorderLayout.PAGE_END);

        // Генерация случайного числа от 0 до 20
        randomNumber = (int) (Math.random() * 21);

        // Обработка нажатия кнопки "Угадать"
        guessButton.addActionListener(e -> {
            int guess = Integer.parseInt(textField.getText());
            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Поздравляю, вы угадали число!");
                System.exit(0);
            } else if (guess > randomNumber) {
                JOptionPane.showMessageDialog(null, "Вы не угадали, число меньше");
            } else {
                JOptionPane.showMessageDialog(null, "Вы не угадали, число больше");
            }
        });
        // Отображение окна
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Numbers numberGuesser = new Numbers();
                numberGuesser.setVisible(true);
            }
        });
    }
}