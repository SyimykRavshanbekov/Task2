package Practice15;

public class Cirle {
    static int PI;

    public void setPI(int PI) {
        Cirle.PI = PI;
    }

    public void area(int radius, int radius2){
        int num = PI*(radius*radius2);
        System.out.printf("%d * (%d * %d) = %d", PI, radius, radius2, num);
    }

    public void circumference(int R){
      int num = 2*PI*R;
        System.out.printf("2 * %d * %d = %d", PI, R, num);
    }
}
