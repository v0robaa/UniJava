package ru.mirea.lab17.n1;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getStudentName()
    {
        return model.getName();
    }

    public String getStudentRolNo()
    {
        return model.getRollNo();
    }

    public void setStudentRolNo(String rollNo)
    {
        model.setRollNo(rollNo);
    }
    public void setStudentName(String name)
    {
        model.setName(name);
    }

    public void updateView()
    {
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
