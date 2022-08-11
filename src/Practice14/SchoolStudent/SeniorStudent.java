package Practice14.SchoolStudent;

public class SeniorStudent extends Student{
    private String favoriteSubject;
    private int classmates;
    private int examScores;

    public SeniorStudent(String name, int age, String gender, String hobby, String studentTeacher,
                         String favoriteSubject, int classmates, int examScores) {
        super(name, age, gender, hobby, studentTeacher);
        this.favoriteSubject = favoriteSubject;
        this.classmates = classmates;
        this.examScores = examScores;
    }
}
