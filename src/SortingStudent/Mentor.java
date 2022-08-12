package SortingStudent;

import java.util.Arrays;

public class Mentor extends Person{
    public Student[] students = new Student[10];
    private int indexOfStudent = 0;

    public Mentor(String name) {
        super(name);
    }
    public void takeAnExam(Student student){
        student.explain();
    }
    public void addStudents(Student student){
        students[indexOfStudent] = student;
        indexOfStudent++;
    }
    public void getStudentsName(){
        System.out.println("\n----------------"+getName()+"----------------");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
