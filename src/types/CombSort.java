package types;

//Сортировка расчёской

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {

        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int size = array.length;
        double factor = 1.247; // Фактор уменьшения default = 1.247;
        int step = array.length - 1;
        int temp;

        System.out.println(Arrays.toString(array));

        while (step >= 1) {
            for (int i = 0; i + step < size; ++i) {
                if (array[i] > array[i + step]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            step /= factor;
        }
        System.out.println(Arrays.toString(array));

    }
}