package main.java.task1;

public class SecFunction {
    public static double sec(double x, int n) {
        if (n <= 0) return Double.NaN;
        if (x % (Math.PI/2) == 0d && x % Math.PI != 0d) {
            return Double.NaN;
        }

        double res = 1;
        double sign = 1;
        double fact = 1;
        double pow = 1;
        for (int i = 1; i < n; i++) {
            sign = sign * -1;
            fact = fact * (2 * i - 1) * (2 * i);
            pow = pow * x * x;
            res = res + sign * pow / fact;
        }

        return 1d/res;
    }
}
