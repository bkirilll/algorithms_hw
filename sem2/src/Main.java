
public class Main {
    public static void main(String[] args) {


        int[] array = new int[]{1, 7, 3, 5, 2, 9, 4, 8, 6};
        heapSort(array);

        for (int i = 0; i <= array.length; i++) {
            System.out.print(i + ", ");
        }
    }

    public static void heapSort(int[] array) {
        int length = array.length;


        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int swap = array[0];
            array[0] = array[i];
            array[i] = swap;
        }
    }

    public static void heapify(int[] array, int length, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, length, largest);
        }
    }

}