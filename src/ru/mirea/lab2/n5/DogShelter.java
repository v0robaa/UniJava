package ru.mirea.lab2.n5;

import ru.mirea.lab2.n5.Dog;

public class DogShelter {
    private Dog[] puppies;
    private int count;
    public DogShelter(int maxSize)
    {
        puppies = new Dog[maxSize];
        count = 0;
    }
    public void addDog(Dog new_dog) {
        if (count < puppies.length)
        {
            puppies[count] = new_dog;
            count++;
        }
        else
        {
            System.out.println("Приют полон, невозможно добавить нового щенка.");
        }
    }
    public void ourDogs() {
        for (int i = 0; i < count; i++)
        {
            System.out.println(puppies[i]);
        }
        System.out.println("Кол-во щенков: " + count);
    }
    public static void main(String[] args)
    {
        DogShelter test = new DogShelter(4);

        Dog dog1 = new Dog("Буня", 2.5);
        test.addDog(dog1);

        Dog dog2 = new Dog("Пашок", 8);
        test.addDog(dog2);

        Dog dog3 = new Dog("Катюха", 0.7);
        test.addDog(dog3);

        test.ourDogs();
    }
}


