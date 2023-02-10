package task2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    int [] y;

    @Test
    void zero_length(){
        QuickSort qs = new QuickSort();
        int[]x = new int[0];
        int low = 0;
        int high = 0;
        qs(x, low, high);
    }

}
