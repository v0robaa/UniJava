package ru.mirea.lab21.n4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class n4 {

    public static List<String> getFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        List<String> fileList = new ArrayList<>();

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileList.add(file.getName());
                    }
                }
            }
        }

        return fileList;
    }
    public static void printFirstFiveElements(List<String> list) {
        int count = 0;
        for (String element : list) {
            System.out.println(element);
            count++;
            if (count == 5) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Первые 5 элементов: ");
        String directoryPath = "/Users/valeriavorobej/IdeaProjects/UniJava/src/ru/mirea/lab21/n4/ctlg.txt";

        List<String> fileList = getFilesInDirectory(directoryPath);
        printFirstFiveElements(fileList);
    }
}
