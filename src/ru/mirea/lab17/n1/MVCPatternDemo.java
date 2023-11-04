package ru.mirea.lab17.n1;


public class MVCPatternDemo {
    public static Student retrieveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Паша");
        student.setRollNo("Ba-12");
        return student;
    }
    public static void main(String[] args)
    {
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Валера");
        System.out.println("После изменений:");
        controller.updateView();
    }
}
