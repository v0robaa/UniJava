package ru.mirea.lab24.n3;
import javax.swing.*;

public class main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Text editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iCreateDocument factory = new CreateTextDocument();
        Window editorWindow = new Window(factory);

        editorWindow.createMenu(frame);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
//i wanna see Java in stats