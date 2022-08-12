package SortingStudent;

import java.util.Arrays;

public class Mentor extends Person{
    public Student[] students = new Student[10];
    private int indexOfStudent = 0;

    public Mentor(String name, int age) {
        super(name, age);
    }

    public void takeAnExam(Student student){
        student.explain();
    }

    public void addStudents(Student student){
        students[indexOfStudent] = student;
        indexOfStudent++;
    }

    public void getStudentsName(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
        }
    }

    public int getIndexOfStudent() {
        return indexOfStudent;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "students=" + Arrays.toString(students);
    }
}
