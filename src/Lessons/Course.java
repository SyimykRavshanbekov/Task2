package Lessons;

public class Course {
    private String courseName;
    private String teacherName;
    private String courseStart;
    private Student[] students = new Student[70];
    private Student[] students2 = new Student[70];
    private String courseLength;
    private String courseAdress;
    private int minimumTypingSpeed = 20;

    private int indexOfLastStudent = 0;
    private int indexOfLastStudent2 = 0;
    private int rejectedStudents = 0;

    public Course(String courseName, String teacherName, String courseStart, String courseLength, String courseAdress){
        this.courseName = courseName;
        if (teacherName.length()<2){
            System.out.println(teacherName + " is incorrect");
        }else {
            this.teacherName = teacherName;
        }

        this.courseStart = courseStart;
        this.courseLength = courseLength;
        this.courseAdress = courseAdress;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getCourseStart() {
        return courseStart;
    }

    public String getCourseLength() {
        return courseLength;
    }

    public String getCourseAdress() {
        return courseAdress;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student[] getStudents2() {
        return students2;
    }

    public int getRejectedStudents() {
        return rejectedStudents;
    }

    public int getIndexOfLastStudent() {
        return indexOfLastStudent;
    }

    public int getIndexOfLastStudent2() {
        return indexOfLastStudent2;
    }

    public int getMinimumTypingSpeed() {
        return minimumTypingSpeed;
    }

    public void addStudents(Student[] sstudent){
        for (int i = 0; i < sstudent.length; i++) {
            if (sstudent[i].getTypingSpeed()>minimumTypingSpeed){
            students[indexOfLastStudent] = sstudent[i];
            indexOfLastStudent++;
        }else {
            rejectedStudents++;
        }
        }

    }

    public void checkStudents(int number){
        for (int i = 0; i < indexOfLastStudent; i++) {
            if (students[i].getTypingSpeed() > 40){
                students2[indexOfLastStudent2] = students[i];
                indexOfLastStudent2++;
            }else {
                System.out.println(students[i].getName() + " you rejected");
            }
        }
    }
}
