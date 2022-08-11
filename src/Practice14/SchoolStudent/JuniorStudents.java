package Practice14.SchoolStudent;

public class JuniorStudents extends Student{
    private String studyLevel;
    private String IntrovertOrExtravert;

    public JuniorStudents(String name, int age, String gender, String hobby, String studentTeacher, String studyLevel, String introvertOrExtravert) {
        super(name, age, gender, hobby, studentTeacher);
        this.studyLevel = studyLevel;
        IntrovertOrExtravert = introvertOrExtravert;
    }


}
