package ru.mirea.lab23.n1_2;
import java.util.Queue;
import java.util.LinkedList;
public class n1_2 {
    int size = 5;
    int items[] = new int[size];
    int front, rear;
    n1_2()
    {
        front = -1;
        rear = -1;
    }
    boolean isFull()
    {
        if (front == 0 && rear == size-1)
        {
            return true;
        }
        return false;
    }
    boolean isEmpty()
    {
        if (front==-1)
        {
            return true;
        }
        else return false;
    }
    void enQueue(int element)
    {
        if (isFull())
        {
            System.out.println("Full");
        }
        else {
            if (front == -1)
            {
                front = 0;
            }
            rear++;

            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }
    int deQueue()
    {
        int element;
        if (isEmpty())
        {
            System.out.println("Empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                //следующий элемент становится первым
                front++;
            }
            System.out.println("Deleted " + element);
            return (element);
        }
    }
    void display()
    {
        int i;
        if (isEmpty())
        {
            System.out.println("Nothing to display");
        }
        else
        {
            System.out.println("\nFront index->" + front);
        }
        System.out.println("Items->");
        for(i = front; i<= rear; i++)
        {
            System.out.print("|" + items[i] + "|");
        }
        System.out.println("\nRead index->" + rear);
    }
    public static void main(String[] args)
    {
        Queue<Integer> que = new LinkedList<>();
        //QueueBasics que = new QueueBasics();

        for (int i = 1; i < 6; i++)
        {
            que.offer(i); // enque
        }
        System.out.println("Queue: " + que);
        int removedNumber = que.poll(); // deque
        System.out.println("Removed " + removedNumber);
        System.out.println("Que after deletion: " + que);
    }
}
