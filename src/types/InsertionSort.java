package types;

//Сортировка вставками

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int size = array.length;
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < size; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}


