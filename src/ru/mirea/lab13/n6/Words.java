package ru.mirea.lab13.n6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {

    public static String readFromFile(String filename) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = fileReader.readLine()) != null) {
                fileContent.append(line).append(" ");
            }
            return fileContent.toString().trim();
        }
    }

    public static StringBuilder getLine(String line) {
        String[] words = line.split(" ");
        boolean[] used = new boolean[words.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!used[i]) {
                result.append(words[i]).append(" ");
                used[i] = true;
                String lastChar = String.valueOf(words[i].charAt(words[i].length() - 1));
                for (int j = i + 1; j < words.length; j++) {
                    if (!used[j] && String.valueOf(words[j].charAt(0)).equalsIgnoreCase(lastChar)) {
                        result.append(words[j]).append(" ");
                        used[j] = true;
                        lastChar = String.valueOf(words[j].charAt(words[j].length() - 1));
                        j = i;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String filename = ("/Users/valeriavorobej/IdeaProjects/UniJava/src/ru/mirea/lab13/n6/Words");
            String line = readFromFile(filename);
            System.out.println(line);
            StringBuilder result = getLine(line);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}