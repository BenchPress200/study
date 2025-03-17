package algorithm.sort;

public class SelectionSort {
    public void run(int[] arr) {
        int start = 0; // 시작범위는 0 부터 끝까지

        while(start < arr.length) {
            int selectedInx = start;
            int selectedValue = arr[selectedInx];
            for (int i = start; i < arr.length; i++) {
                if(arr[i] < selectedValue) {
                    selectedInx = i;
                    selectedValue = arr[i];
                }
            }

            swap(arr, start, selectedInx);
            start++;
        }

    }

    private void swap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }
}
