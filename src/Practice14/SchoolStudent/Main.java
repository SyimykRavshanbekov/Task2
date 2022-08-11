package Practice14.SchoolStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first student");
        Student student1 = new Student("Syimyk", 16, "male", "football", "Zhanarbek");
        Student student2 = new Student("Bakai", 30, "male", "football", "Zhanarbek");
        Student student3 = new Student("Samarbek", 30, "male", "football", "Zhanarbek");
        JuniorStudents juniorStudents = new JuniorStudents("Syimyk", 45, "male", "footbal", "Zhanarbek", "Very Well", "Introvert");
        SeniorStudent seniorStudent = new SeniorStudent("Syimyk", 15, "male", "football", "Zhanarbek", "football", 50, 100);

//
        Student[] students = {student1, student2, student3, juniorStudents, seniorStudent};
        System.out.println("Enter the school details:");
        School school = new School("Bishkek", "2020", "Esen", 13);
        school.addStudent(students);

        System.out.println("---------------SCHOOL DETAILS-------------------");
        System.out.println(school);

        System.out.println("------------------STUDENTS----------------------");



    }
}
