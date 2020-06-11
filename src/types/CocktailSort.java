package types;

// Сортировка перемешиванием (шейкерная сортировка)

import java.util.Arrays;

public class CocktailSort {

    public static void main(String[] args) {
        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int size = array.length;
        int temp;

        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = size - 1;
        do {
            for (int i = right; i > left; --i) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i < right; ++i) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
        } while (left <= right);

        System.out.println(Arrays.toString(array));
    }
}

