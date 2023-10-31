package ru.mirea.lab11.n3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException; //обработка исключений парсинга

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFormattedDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student: " +
                "name '" + name + '\'' +
                ", dateOfBirth " + dateOfBirth;
    }

    public static void main(String[] args) throws ParseException { //обработка исключений
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = dateFormat.parse("28-09-2003"); //преобразование

        Student student = new Student("Воробей Валерия", dateOfBirth);
        System.out.println(student);
        System.out.println("Дата рождения (кратко): " + student.getFormattedDateOfBirth("dd.MM.yy"));
        System.out.println("Дата рождения (средняя): " + student.getFormattedDateOfBirth("dd MMM yyyy"));
        System.out.println("Дата рождения (полная): " + student.getFormattedDateOfBirth("EEEE, dd MMMM yyyy"));
        }
    }

