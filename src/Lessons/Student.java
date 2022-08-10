package Lessons;

public class Student {
    private int age;
    private String name;
    private String gender;
    private int typingSpeed;
    private String englishLevel;
    private String studyFormat;

    public Student(int age, String name, String gender, int typingSpeed, String englishLevel, String studyFormat){
        if (name.length()>2){
            this.name = name;
        }else {
            System.out.println("Name: " + name + " is incorrect");
        }

        if (age>0){
            this.age = age;
        }else {
            System.out.println("Age " + age + " incorrect for " + name);
        }

        if (gender.equals("female") || gender.equals("male")){
            this.gender = gender;
        }else {
            System.out.println("Gerder " + gender + " incorrect for " + name);
        }

        this.typingSpeed = typingSpeed;
        this.englishLevel = englishLevel;
        this.studyFormat = studyFormat;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public int getTypingSpeed(){
        return typingSpeed;
    }

    public String getEnglishLevel(){
        return englishLevel;
    }

    public String getStudyFormat(){
        return studyFormat;
    }
}
