package Persons;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void walk(){
        System.out.println("I am walking");
    }

    public void learn(){
        System.out.println("I am learning");
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                " | designation = '" + designation + '\'';
    }
}
