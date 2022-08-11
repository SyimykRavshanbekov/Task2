package Practice14.SchoolStudent;

import java.util.Random;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private String gender;
    private String hobby;
    private String studentTeacher;
    private int marks = 0;

    public Student(String name, int age, String gender, String hobby, String studentTeacher) {
        Random random = new Random();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.studentTeacher = studentTeacher;
        this.marks = random.nextInt(10,101);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getStudentTeacher() {
        return studentTeacher;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return
                "name ='" + name + '\'' +
                "\nage =" + age +
                "\ngender ='" + gender + '\'' +
                "\nhobby ='" + hobby + '\'' +
                "\nstudentTeacher ='" + studentTeacher + '\'' +
                "\nmarks =" + marks;
    }
}
