public class CocktailSort {
    public static void cocktailSort(int[] array) {
        boolean swapped;
        int start = 0;
        int end = array.length - 1;

        do {
            swapped = false;

            // Прохід вперед
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            end--;

            if (!swapped) {
                break;
            }

            // Прохід назад
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            start++;
        } while (swapped);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        cocktailSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

