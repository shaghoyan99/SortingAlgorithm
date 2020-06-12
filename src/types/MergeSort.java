package types;

//Сортировка слиянием

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        System.out.println(Arrays.toString(array));
        int[] res = sortMerge(array);
        System.out.println(Arrays.toString(res));

    }

    public static int[] sortMerge(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - (array.length / 2)];

        System.arraycopy(array, 0, left, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, right, 0, array.length - (array.length / 2));
        left = sortMerge(left);
        right = sortMerge(right);
        return merge(left, right);

    }

    //Метод объединения массивов

    private static int[] merge(int[] a, int[] b) {
        int[] ros = new int[a.length + b.length];
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                ros[k] = a[i];
                i++;
            } else {
                ros[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            ros[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            ros[k] = b[j];
            j++;
            k++;
        }

        return ros;
    }
}
