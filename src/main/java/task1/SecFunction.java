package main.java.task1;

public class SecFunction {
    public static double sec(double x, int iter) {
        if (iter <= 0) return Double.NaN;
        if (x % (Math.PI/2) == 0d && x % Math.PI != 0d) {
            return Double.NaN;
        }

        double res = 1d;
        double sign = 1d;
        double fact = 1d;
        double pow = 1d;
        for (int i = 1; i < iter; i++) {
            sign *= -1;
            fact *= (2 * i - 1) * (2 * i);
            pow *= x * x;
            res += sign * pow / fact;
        }

        return 1d/res;
    }
}
