package ru.mirea.lab5.n1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Game {
    private static int RmScore = 0, MilScore = 0;
    public static String win = "Draw", lastScorer = "N/A";
    public static void main(String[] args)
    {
        //настройки фрейма
        JFrame frame = new JFrame("Football Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        //настройки панели
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(300, 300));

        //добавление кнопок
        JButton MadridButton = new JButton("Real Madrid");
        JButton MilanButton = new JButton("FC Milan");
        panel.add(MadridButton);
        panel.add(MilanButton);

        //надписи
        JLabel resultLabel = new JLabel(RmScore + "X" + MilScore, JLabel.CENTER);
        resultLabel.setPreferredSize(new Dimension(200, 200));
        JLabel winner = new JLabel("Winner: " + win);
        JLabel Last = new JLabel("Last scorer: " + lastScorer);
        MadridButton.setActionCommand("123");
        winner.setPreferredSize(new Dimension(150, 50));
        Last.setPreferredSize(new Dimension(200, 50));

        //реализация логики нажатия кнопок
        ActionListener al1 = e -> {
            RmScore += 1;
            lastScorer = "Madrid";
            if (RmScore > MilScore) win = "Madrid win";
            if (RmScore == MilScore) win = "Draw";
            if (RmScore < MilScore) win = "Milan win";
            winner.setText("Winner: " + win);
            Last.setText("Last scorer: " + lastScorer);
            resultLabel.setText(RmScore + "X" + MilScore);
        };
        ActionListener al2 = e -> {
            MilScore += 1;
            lastScorer = "Milan";
            if (RmScore > MilScore) win = "Madrid win";
            if (RmScore == MilScore) win = "Draw";
            if (RmScore < MilScore) win = "Milan win";
            winner.setText("Winner: " + win);
            Last.setText("Last scorer: " + lastScorer);
            resultLabel.setText(RmScore + "X" + MilScore);
        };

        MadridButton.addActionListener(al1);
        MilanButton.addActionListener(al2);
        panel.add(resultLabel);
        panel.add(winner);
        panel.add(Last);
        panel.add(MadridButton);
        panel.add(MilanButton);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}

