package algorithm.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};
        BubbleSort bubbleSort = new BubbleSort();

        printArray(arr);
        bubbleSort.run(arr); // 버블 정렬 진행
        printArray(arr);

        arr = new int[] {3, 4, 5, 1, 10, 6, 9, 2, 8, 7};

        printArray(arr);
        bubbleSort.runOpt(arr); // 최적화된 버블 정렬 진행
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
