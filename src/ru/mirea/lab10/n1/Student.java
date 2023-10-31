package ru.mirea.lab10.n1;

public class Student {
    private String name;
    private String sname;
    private String spec;
    private int course;
    private int group;

    public Student(String name, String sname, String spec, int course, int group)
    {
        this.name = name;
        this.sname = sname;
        this.spec = spec;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String surname) {
        this.sname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int curse) {
        this.course = curse;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    public String toString()
    {
        return "Студент: " + " Имя - " + name + ", Фамилия - " + sname + ", Специальность - " + spec + ", Курс - " + course + ", Группа - " + group;
    }
}
