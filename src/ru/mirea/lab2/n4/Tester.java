package ru.mirea.lab2.n4;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shop test_shop = new Shop();
        Scanner in = new Scanner(System.in);
        Scanner int_in = new Scanner(System.in);
        int case_num = -1;
        while (case_num != 0) {
            System.out.println("Введите 1 для добавления пк");
            System.out.println("Введите 2 для удаления пк");
            System.out.println("Введите 3 для поиска пк");
            System.out.println("Введите 0 для выхода");
            case_num = int_in.nextInt();
            switch (case_num) {
                case 1:
                    String name = in.nextLine();
                    test_shop.addPC(name);
                    for (int i = 0; i < test_shop.pcCount; i ++) {
                        System.out.println("PC" + (i + 1) + ": " + test_shop.arr[i].getName());
                    }
                    break;
                case 2:
                    test_shop.delPC(in.nextLine());
                    for (int i = 0; i < test_shop.pcCount; i ++) {
                        System.out.println("PC" + (i + 1) + ": " + test_shop.arr[i].getName());
                    }
                    break;
                case 3:
                    String s;
                    s = in.nextLine();
                    System.out.println(test_shop.findPC(s).getName() + " найден!");
                    for (int i = 0; i < test_shop.pcCount; i++) {
                        System.out.println("PC" + (i + 1) + ": " + test_shop.arr[i].getName());
                    }
                    break;
            }
        }
    }
}
