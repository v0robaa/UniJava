package ru.mirea.lab10.n2;
import java.util.Comparator;
import java.util.Scanner;
public class Tester
{
    private Comparator<Student> cmp;
    private Student[] idNumber;
    public Tester(Comparator<Student> comp, Student[] s)
    {
        this.cmp = comp;
        idNumber = s;
    }
    public void setCmp(Comparator<Student> cmp)
    {
        this.cmp = cmp.reversed();
    }
    public void setArray(Student[] s)
    {
        idNumber = s;
    }
    public void outArray()
    {
        for(Student s : idNumber)
            System.out.println(s);
    }
    private int separation(Student[] s, int left, int right)
    {
        Student pivot = s[(left+right)/2];
        int i = left;
        int j = right;
        for(;;)
        {
            while(cmp.compare(s[i], pivot) < 0)
                i++;
            while(cmp.compare(pivot, s[j]) < 0)
                j--;
            if(i >= j) break;
            Student tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
        return j;
    }
    private void s_sort(Student[] s, int left, int right)
    {
        if(left<right)
        {
            int p = separation(s, left, right);
            s_sort(s, left, p);
            s_sort(s, p + 1, right);
        }
    }
    private void merge(Student[] s, Student[] a, Student[] b, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right)
        {
            if(cmp.compare(a[i], b[j]) < 0)
                s[k++] = a[i++];
            else
                s[k++] = b[j++];
        }
        while(i < left)
            s[k++] = a[i++];
        while(j < right)
            s[k++] = b[j++];
    }
    private void merge_sort(Student[] s, int n)
    {
        if(n < 2) return;
        int mid = n/2;
        Student[] left = new Student[mid];
        Student[] right = new Student[n-mid];
        for(int i = 0; i < mid; ++i)
            left[i] = s[i];
        for(int i = mid; i < n; ++i)
            right[i-mid] = s[i];
        merge_sort(left, mid);
        merge_sort(right, n-mid);
        merge(s, left, right, mid, n-mid);
    }
    public void quicksort()
    {
        s_sort(idNumber, 0, idNumber.length-1);
    }
    public void mergeSort()
    {
        merge_sort(idNumber, idNumber.length);
    }
    public void mergeAndSort(Student[] s1, Student[] s2)
    {
        merge(new Student[s1.length+s2.length], s1, s2, s1.length, s2.length);
        mergeSort();
    }
    public static void main(String[] args)
    {
        Student[] students = new Student[5];
        students[0]=new Student("Анастасия", "Малинка", "Программист", 2, 5 );
        students[1]=new Student("Мария", "Клубок", "Программист", 3,23 );
        students[2]=new Student("Владимир", "Смирнов", "Физик", 3, 8);
        students[3]=new Student("Петр", "Бахов", "Юрист", 1, 5);
        students[4]=new Student("Сашка", "Сенной", "Химик", 4,17 );
        System.out.println("Вид сортировки: ");
        System.out.println("1 - Имя, 2 - Фамилия, 3 - Специальность, 4 - Курс, 5 - Группа");
        Scanner in = new Scanner(System.in);
        Comparator<Student> cmp;
        while(true)
        {
            int a = in.nextInt();
            if(a==1)
            {
                cmp = Comparator.comparing(Student::getName);
                break;
            }
            else if(a==2)
            {
                cmp = Comparator.comparing(Student::getSname);
                break;
            }
            else if(a==3)
            {
                cmp = Comparator.comparing(Student::getSpec);
                break;
            }
            else if(a==4)
            {
                cmp = Comparator.comparing(Student::getCourse);
                break;
            }
            else if(a==5)
            {
                cmp = Comparator.comparing(Student::getGroup);
                break;
            }
            else System.out.println("Ошибка!");
        }
        Tester main = new Tester(cmp, students);
        System.out.println("Изначальный список: ");
        main.outArray();
        System.out.println("\n");
        main.quicksort();
        System.out.println("Отсортированный список: ");
        main.outArray();
    }
}
