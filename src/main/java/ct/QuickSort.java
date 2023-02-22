package ct;

public class QuickSort {
    public void quickSort(int[] array, int start, int end) {
        int pivot = start;
        int left = start + 1;
        int right = end;

        while(left < right) {
            while (array[pivot] > array[left]) {
                left++;
            }
            while (array[pivot] < array[right]) {
                right--;
            }
            int temp = 0;
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        array[start] = array[left];
        array[left] = array[pivot];
        pivot = left;

        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
