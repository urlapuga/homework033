package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class ArraysUtils {

    int[] reverse(int[] array) {
        int[] arr = {0};
        int j = 0;
        for (int i = array.length; 0 == i; i--) {
            arr[j] = array[i];
            j++;
        }
        return arr;
    }

    int[] findEvenElements(int[] array) {
        int[] arr = {0};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                arr[j] = array[i];
                j++;
            }
        }
        return arr;
    }

    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double sum(double arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double min(double arr[]) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) if (min > arr[i]) min = arr[i];
        return min;
    }

    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) if (min > arr[i]) min = arr[i];
        return min;
    }

    static double max(double arr[]) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }

    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }

    static double maxPositive(double arr[]) {
        double maxPositive = 0;
        for (int i = 0; i < arr.length; i++) if (maxPositive < arr[i] && arr[i] > 0) maxPositive = arr[i];
        return maxPositive;
    }

    static int maxPositive(int arr[]) {
        int maxPositive = 0;
        for (int i = 0; i < arr.length; i++) if (maxPositive < arr[i] && arr[i] > 0) maxPositive = arr[i];
        return maxPositive;
    }

    static double multiplication(double arr[]) {
        double multiplication = 1;
        for (int i = 0; i < arr.length; i++) multiplication *= arr[i];
        return multiplication;
    }

    static int multiplication(int arr[]) {
        int multiplication = 1;
        for (int i = 0; i < arr.length; i++) multiplication *= arr[i];
        return multiplication;
    }

    static double[] modulusArr(double[] arr) {
        double[] returnArr = {0, 0};
        returnArr[0] = Math.abs(arr[0]);
        returnArr[1] = Math.abs(arr[arr.length - 1]);
        return returnArr;
    }

    static int[] modulusArr(int[] arr) {
        int[] returnArr = {0, 0};
        returnArr[0] = Math.abs(arr[0]);
        returnArr[1] = Math.abs(arr[arr.length - 1]);
        return returnArr;
    }

    static double modulus(double value) {
        return Math.abs(value);
    }

    static int modulus(int value) {
        return Math.abs(value);
    }

    static double secondLargest(double arr[]) {
        double max1 = max(arr);
        double max2 = arr[0];
        for (int i = 0; i < arr.length; i++) if (max2 < arr[i] && arr[i] != max1) max2 = arr[i];
        return max2;
    }

    static int secondLargest(int arr[]) {
        int max1 = max(arr);
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) if (max2 < arr[i] && arr[i] != max1) max2 = arr[i];
        return max2;
    }
}
