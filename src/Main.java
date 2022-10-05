import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int x0 = 0;
        double epsilon = 0.0001;
        double a = Integer.parseInt(args[0]);
        double newX = function(x0, a);
        double oldX = x0;
        if (a == -1) {
            System.out.println(0);
        } else if (a > -1) {
            System.out.println("I've got no roots, but my home was never on the ground");
        } else {
            while (Math.abs(newX - oldX) >= epsilon) {
                oldX = newX;
                newX = function(oldX, a);
            }
        }
        System.out.println(newX);
    }

    public static double function(double x0, double a) {
        return x0 - (1 / (Math.exp(Math.abs(a)) - 1)) * (Math.exp(x0) - x0 + a);
    }
}
