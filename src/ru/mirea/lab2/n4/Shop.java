package ru.mirea.lab2.n4;

public class Shop {
    public PC[] arr;
    int pcCount;
    public PC fail = new PC();

    Shop() {
        arr = new PC[0];
        pcCount = 0;
    }

    public PC findPC(String name) {
        for (int i = 0; i < pcCount; i++) {
            if (arr[i].getName().equals(name)) {
                return arr[i];
            }
        }
        //System.out.println("Компьютер не найден");
        return fail;
    }

    public void addPC(String name) {
        PC arr2[] = new PC[pcCount + 1];
        for (int i = 0; i < pcCount; i++) {
            arr2[i] = arr[i];
            if (arr[i].getName() == name) {
                return;
            }
        }
        arr2[pcCount] = new PC(name);

        pcCount += 1;
        arr = arr2;
    }

    public void delPC(String nName) {
        if (this.findPC(nName) != null) {
            System.out.println("Компьютер удален");
            pcCount--;
            int j = 0;
            PC arr2[] = new PC[pcCount];
            for (int i = 0; i < pcCount; i++) {
                if (nName.equals(arr[i].getName())) {
                    arr2[j] = arr[i];
                    j++;
                }
            }
        }
    }
}
