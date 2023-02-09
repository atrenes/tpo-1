package main.java.task1;

public class SecFunction {
    public static double sec(double x) {
        if (x % Math.PI/2 == 0 && x % Math.PI != 0) {
            return Double.NaN;
        }



        return 0d;
    }
}
