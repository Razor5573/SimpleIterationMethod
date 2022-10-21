import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int x0 = 0;
        double epsilon = 0.0001;
        double a = Integer.parseInt(args[0]);
        double newX = reverseFunction(x0, a);
        double oldX = x0;
        if (a == 1) {
            System.out.println(0);
        } else if (a < 1) {
            System.out.println("I've got no roots, but my home was never on the ground");
        } else {
            while (Math.abs(newX - oldX) >= epsilon) {
                oldX = newX;
                newX = reverseFunction(oldX, a);
            }
        }
        System.out.println(newX);
        newX = function (x0, a);
        oldX = x0;
        while(Math.abs(newX - oldX) >= epsilon) {
            oldX = newX;
            newX = function(oldX, a);
        }
        System.out.println(newX);
    }

    public static double reverseFunction(double x, double a){
        return Math.log(x + a);
    }

    public static double function(double x, double a) {
        return Math.exp(x) - a;
    }
}
