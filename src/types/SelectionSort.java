package types;

//Сортировка выбором

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int size = array.length;
        int temp;
        System.out.println(Arrays.toString(array));

        int min;
        for (int i = 0; i < size; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
