package HomeWork16;

import java.util.Arrays;

public class Animal {


    public String method(){
        return "I'm eating";
    }

    @Override
    public String toString() {
        Class c = getClass();
        return c.toString();
    }
}
