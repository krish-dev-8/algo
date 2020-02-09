package basic;

public class SelectionSort {
    public static void sort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            int minIndex = i;
            //find the index of min valued element in the array of i to end
            for (int j = i + 1; j < source.length; j++) {
                if (source[j] < source[minIndex]) {
                    minIndex = j;
                }
            }
            //swap source[i] and source[minIndex]
            int temp = source[i];
            source[i] = source[minIndex];
            source[minIndex] = temp;
        }
    }
}