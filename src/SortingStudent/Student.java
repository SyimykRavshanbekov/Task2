package SortingStudent;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }
    public void explain(){
        System.out.println("OOP is object oriented programming");
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
