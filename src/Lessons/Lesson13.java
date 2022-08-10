package Lessons;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Random;

public class Lesson13 {
    public static void main(String[] args) {
        Random random = new Random();
        Course course = new Course("Java7", "Zh", "01.07.22", "9 month", "Grazhdanskaya");

        Student student1 = new Student(16, "Syimyk", "male", 41, "B2", "OFFLINE");
        Student student2 = new Student(18, "Eldiyar", "male", 40, "A2", "OFFLINE");
        Student student3 = new Student(20, "Kerezbek", "male", 10, "A1", "OFFLINE");
        Student student4 = new Student(22, "Kairat", "male", 25, "A1", "OFFLINE");


        Student[] sstudents = {student1, student2, student3, student4};
        course.addStudents(sstudents);

        System.out.println("------------ COURSE DETAILS ----------------");
        System.out.println("COURSE NAME: " + course.getCourseName());
        System.out.println("TEACHER NAME: " + course.getTeacherName());
        System.out.println("START DAY: " + course.getCourseStart());
        System.out.println("COURSE LENGTH :" + course.getCourseLength());
        System.out.println("ADDRESS " + course.getCourseAdress());
        System.out.println("MINIMUM TYPING SPEED " + course.getMinimumTypingSpeed());

        System.out.println("--------------------------------------------------------------------------");

        System.out.println(course.getIndexOfLastStudent() + " students passed");
        System.out.println(course.getRejectedStudents() + " rejected students");

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("-------TOURNAMENT HAS BEGUN-----------");
        System.out.println("\n----STUDENTS PASSED 20 WPM----");

        for (int i = 0; i < course.getIndexOfLastStudent(); i++) {
            Student[] passedStudents = course.getStudents();

            System.out.println("NAME : "+ passedStudents[i].getName());
            System.out.println("AGE : "+ passedStudents[i].getAge());
            System.out.println("GENDER : "+ passedStudents[i].getGender());
            System.out.println("TYPING SPEED : "+ passedStudents[i].getTypingSpeed());
            System.out.println("ENGLISH LEVEL : "+ passedStudents[i].getEnglishLevel());
            System.out.println("STUDY FORMAT : "+ passedStudents[i].getStudyFormat());
            System.out.println("-----------------------");
        }

        System.out.println("-------TOURNAMENT HAS BEGUN-----------");

        course.checkStudents(40);

        System.out.println("\n----STUDENTS PASSED 40WPM----");

        for (int i = 0; i < course.getIndexOfLastStudent2(); i++) {
            Student[] passedStudents = course.getStudents2();

            System.out.println("NAME : "+ passedStudents[i].getName());
            System.out.println("AGE : "+ passedStudents[i].getAge());
            System.out.println("GENDER : "+ passedStudents[i].getGender());
            System.out.println("TYPING SPEED : "+ passedStudents[i].getTypingSpeed());
            System.out.println("ENGLISH LEVEL : "+ passedStudents[i].getEnglishLevel());
            System.out.println("STUDY FORMAT : "+ passedStudents[i].getStudyFormat());
            System.out.println("-----------------------");
        }

    }
}
