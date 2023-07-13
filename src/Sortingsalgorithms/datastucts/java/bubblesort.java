package Sortingsalgorithms.datastucts.java;

public class bubblesort {
    public static void main(String []args){
        int[] arr = new int[]{7, 6, 5, 8, 0, 1};
        sorter(arr);
    }
    public static void sorter(int[] arr){
        int i, j, temp;
        boolean swapped;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
        for (int element:
            arr ) {
            System.out.println(element);

        }
    }

}

