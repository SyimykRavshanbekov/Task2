package HomeWork16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Shark shark = new Shark();

        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];
        Shark[] sharks = new Shark[1];

        Animal[] animals = {turtle, eagle, shark};

        for (Animal i: animals) {
            System.out.println(i.toString() + ": "+i.method());
        }

        System.out.println();

        for (int i = 0, num = 0; i < animals.length; i++) {
            if (animals[i] instanceof Turtle){
                turtles[num] = (Turtle)animals[i];
            }
            if (animals[i] instanceof Eagle){
                eagles[num] = (Eagle)animals[i];
            }
            if (animals[i] instanceof Shark){
                sharks[num] = (Shark)animals[i];
            }
        }

        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(eagles));
    }
}
