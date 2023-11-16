package ru.mirea.lab17.n3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class View extends JFrame{ //View
    private JTextField jtx1;
    private JTextField jtx2;
    private JTextField jtx3;
    private  JLabel layout;
    private int x;
    public View()
    {
        super("Расчет посещений");
        super.setBounds(150, 250, 300, 200);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());
        setLayout(null);
        JLabel service = new JLabel("Недель:");
        service.setBounds(20,10,70,20);
        JLabel pas = new JLabel("Учебные дни:");
        pas.setBounds(20,35,115,20);
        JLabel user = new JLabel("Пропуски:");
        user.setBounds(20,60,95,20);
        jtx1 = new JTextField();
        jtx1.setBounds(140,10,130,20);
        jtx2 = new JTextField();
        jtx2.setBounds(140,35,130,20);
        jtx3 = new JTextField();
        jtx3.setBounds(140,60,130,20);
        JButton but = new JButton("Рассчитать");
        but.setBounds(100,90,100,20);
        layout = new JLabel("Посещено: ");
        layout.setBounds(80,120,100,20);
        super.add(service);
        super.add(pas);
        super.add(user);
        super.add(jtx1);
        super.add(jtx2);
        super.add(jtx3);
        super.add(but);
        super.add(layout);
        but.addActionListener(new retiveModel());
    }
    private class retiveModel implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int weeks = Integer.parseInt(jtx1.getText());
            int studyDays = Integer.parseInt(jtx2.getText());
            int missed=Integer.parseInt(jtx3.getText());

            Model(weeks,studyDays,missed);
        }
    }
    public void Model(int w, int sd,int missed)
    {
        x = w*sd-missed;
        UpdateView();
    }
    private void UpdateView()
    {
        layout.setText(layout.getText()+x);
    }

    public static void main(String[] args)
    {
        View form = new View();
        form.setVisible(true);
    }
}
