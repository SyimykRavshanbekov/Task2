package Persons;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("I am coding");
    }

    @Override
    public String toString() {
        return  "Programmer: " + super.toString() +
                "| companyName = '" + companyName + '\'';
    }
}
