package Practice15;

public class Cirle {
    static double PI;

    public void setPI(double PI) {
        Cirle.PI = PI;
    }

    public void area(int radius, int radius2){
        double num = PI*(radius*radius2);
        System.out.printf("%f * (%d * %d) = %f", PI, radius, radius2, num);
    }

    public void circumference(int R){
      double num = 2*PI*R;
        System.out.printf("2 * %f * %d = %f", PI, R, num);
    }
}
