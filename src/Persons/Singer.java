package Persons;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void sing(){
        System.out.println("I am singing");
    }
    public void playGuitar(){
        System.out.println("I am playing guitar");
    }

    @Override
    public String toString() {
        return "Singer: " + super.toString() +
                "| bandName = '" + bandName + '\'';
    }
}
