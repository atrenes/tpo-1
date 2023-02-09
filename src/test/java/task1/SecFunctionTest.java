package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SecFunctionTest {
    double eps = 0.001;
    int iter = 20;

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI/2d, -Math.PI/2d, 5*Math.PI/2d, -3d*Math.PI/2d})
    public void restrictedXCheck(double value) {
        Assertions.assertTrue(Double.isNaN(task1.SecFunction.sec(value, iter)));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1d, 2d, 3d, 4d})
    public void positiveCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2.5, -3.1, -0.9, -6.7})
    public void negativeCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI/2d - 0.1, Math.PI/2d + 0.1, 3d*Math.PI/2d + 0.09, 5d*Math.PI/2d - 0.05})
    public void positiveCloseCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI/2d + 0.03, -Math.PI/2d - 0.06, -5d*Math.PI/2d + 0.03, -7d*Math.PI/2d - 0.2})
    public void negativeCloseCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.001, -0.0001, 0.0001, 0.001})
    public void zeroCloseCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0d, -0d, -0.000_001, 0.000_001})
    public void zeroCheck(double value) {
        Assertions.assertEquals(1/Math.cos(value), SecFunction.sec(value, iter), eps);
    }
}
