package Practice14.SchoolStudent;

import java.util.Arrays;

public class School {
    private String city;
    private String existsSince;
    private String nameDirectory;
    private int teacherNumber;
     Student[] students = new Student[70];


    public School(String city, String existsSince, String nameDirectory, int teacherNumber) {
        this.city = city;
        this.existsSince = existsSince;
        this.nameDirectory = nameDirectory;
        this.teacherNumber = teacherNumber;
        this.students = students;
    }

    public void addStudent(Student[] student){
        for (int i = 0; i < student.length; i++) {
            student[i] = students[i];
        }
    }

    public Student[] getStudents() {
        return students;
    }



    @Override
    public String toString() {
        return
                "city = '" + city + '\'' +
                "\nexistsSince ='" + existsSince + '\'' +
                "\nnameDirectory ='" + nameDirectory + '\'' +
                "\nteacherNumber =" + teacherNumber ;
    }
}
