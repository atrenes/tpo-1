package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SecFunctionTest {
    double eps = 0.1;
    int iter = 10;

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI/2, -Math.PI/2, 5*Math.PI/2, -3*Math.PI/2})
    public void restrictedXCheck(double value) {
        Assertions.assertTrue(Double.isNaN(SecFunction.sec(value, iter)));
    }

    @ParameterizedTest
    @ValueSource(doubles = {})
    public void positiveCheck(double value) {

    }
}
