package ru.mirea.lab16.n3;

import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
    public Password() {
        setTitle("Password application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Создание панели с компоновкой GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Создание и добавление компонентов на панель
        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(serviceLabel);
        panel.add(serviceField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Установка отступов для панели
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Добавление панели на контентное окно
        add(panel);

        // Отображение окна
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Password passwordChecker = new Password();
                passwordChecker.setVisible(true);
            }
        });
    }
}