package task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class QuickSortTest {
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    @Test
    public void bubbleTest() {
        int[] array = new int[15];
        int min = -100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        for (int j = 0; j < 15; j++) {
            int i = random.nextInt(diff + 1);
            i += min;
            array[j] = i;
        }
        int low = 0;
        int high = array.length - 1;
        int[] qsArray = QuickSort.quickSort(array, low, high);
        int[] bblArray = bubbleSort(array);
        assertArrayEquals(qsArray, bblArray);
    }
    @Test
    public void emptyArray(){
        int[] array = new int[0];
        int low = 0;
        int high = array.length - 1;
        int[] qsArray = QuickSort.quickSort(array, low, high);
        assertArrayEquals(qsArray, array);
    }
    @Test
    public void handArray(){
        int[] array = {127, 4, -20, -60, 127, 195, 14, -28, 163, -69, 172, -20, 18, 178, -87};
        int[] sortedArray = {-87, -69, -60, -28, -20, -20, 4, 14, 18, 127, 127, 163, 172, 178, 195};

        int low = 0;
        int high = array.length - 1;
        int[] qsArray = QuickSort.quickSort(array, low, high);
        assertArrayEquals(qsArray, sortedArray);
    }

}
