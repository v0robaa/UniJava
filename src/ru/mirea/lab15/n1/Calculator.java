package ru.mirea.lab15.n1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton("Сложить");
    JButton buttonSub = new JButton("Вычесть");
    JButton buttonMult = new JButton("Умножить");
    JButton buttonDiv = new JButton("Разделить");
    JButton buttonExp = new JButton("Степень");
    Calculator()
    {
        super("Example"); //super создаёт новый, изначально невидимый фрейм с названием
        setLayout(new FlowLayout());
        setSize(400,200);
        add(new JLabel("Число 1:")); //создаём первую надпись
        add(jta1); //создаём текстовое поле
        add(new JLabel("Число 2:"));
        add(jta2);
        add(buttonAdd);
        add(buttonSub);
        add(buttonMult);
        add(buttonDiv);
        add(buttonExp);
        buttonAdd.addActionListener(new ActionListener() { //добавляем кнопке проверку активности
            @Override
            public void actionPerformed(ActionEvent ae) { //добавляем реализацию выполненной активности
                try {
                    //x1 и х2 хранят вводы в свои текстовые поля
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //всплывающее окно с информацией:
                    JOptionPane.showMessageDialog(null, "Результат = " + (x1 + x2), "Посчитал я", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) { //TODO
                    //всплывающее окно с ошибкой
                    JOptionPane.showMessageDialog(null, "Ошибка! ", "Эй", JOptionPane.ERROR_MESSAGE);
                }
            }
        }); //ставим в конце кнопки скобку и точку с запятой
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + (x1 - x2), "Посчитал я", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка! ", "Эй", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + (x1 * x2), "Посчитал я", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка! ", "Эй", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Посчитал я", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка! ", "Эй", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + (Math.pow(x1, x2)), "Посчитал я", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка! ", "Эй", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
        super.setTitle("Счётовод"); //задает название окна
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа будет вырубаться при закрытии окна
    }
    public static void main(String[] args)
    {
        new Calculator();
    }

}