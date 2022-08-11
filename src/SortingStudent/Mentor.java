package SortingStudent;

import java.util.Arrays;

public class Mentor extends Person{
    private Student[] students;
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

    @Override
    public String toString() {
        return "Mentor{" +
                "students=" + Arrays.toString(students);
    }
}
