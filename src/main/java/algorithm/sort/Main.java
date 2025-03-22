package algorithm.sort;

public class Main {
    public static void main(String[] args) {
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort quickSort = new QuickSort();

        // 버블 정렬
        int[] arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        printTestResult(arr, bubbleSort);

        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        printOptTestResult(arr, bubbleSort);


        // 선택 정렬
        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        printTestResult(arr, selectionSort);


        // 삽입 정렬
        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        printTestResult(arr, insertionSort);


        // 퀵 정렬
        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        printTestResult(arr, quickSort);
    }

    private static void printTestResult(int[] arr, Sort sort) {
        System.out.println(sort.getName() + " Sort");
        System.out.print("Before Sorting: ");
        printArray(arr);
        sort.run(arr);
        System.out.print("After Sorting: ");
        printArray(arr);
        System.out.println();
    }

    private static void printOptTestResult(int[] arr, Sort sort) {
        System.out.println(sort.getName() + " Sort");
        System.out.print("Before Sorting: ");
        printArray(arr);
        sort.runOpt(arr);
        System.out.print("After Sorting: ");
        printArray(arr);
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
