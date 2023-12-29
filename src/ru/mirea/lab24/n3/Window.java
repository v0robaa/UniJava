package ru.mirea.lab24.n3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window
{
    private iDocument document;
    private iCreateDocument documentFactory;

    public Window(iCreateDocument documentFactory)
    {
        this.documentFactory = documentFactory;
        this.document = null;
    }
    public void createNewDocument()
    {
        if (document != null)
        {
            document.close();
        }
        document = documentFactory.createNew();
        document.open();
    }
    public void openDocument()
    {
        if (document != null)
        {
            document.close();
        }
        document = documentFactory.createOpen();
        document.open();
    }
    public void saveDocument()
    {
        if (document != null)
        {
            document.save();
        }
    }
    public void exitApplication() {
        if (document != null) {
            document.close();
        }

        System.out.println("Exiting the application");
        System.exit(0);
    }
    public void createMenu(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createNewDocument();
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveDocument();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitApplication();
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
    }

}