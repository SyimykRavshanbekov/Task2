package Persons;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;

    }

    public void dancing(){
        System.out.println("I am dancing");
    }

    @Override
    public String toString() {
        return "Dancer: " + super.toString() +
                "| groupName = '" + groupName + '\'';
    }
}
