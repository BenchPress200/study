package algorithm.sort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        // 버블 정렬
        int[] arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        System.out.println("Bubble Sort");
        printArray(arr);
        bubbleSort.run(arr);
        printArray(arr);

        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        System.out.println("Bubble Sort - opt");
        printArray(arr);
        bubbleSort.runOpt(arr);
        printArray(arr);


        // 선택 정렬
        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        System.out.println("Selection Sort");
        printArray(arr);
        selectionSort.run(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
