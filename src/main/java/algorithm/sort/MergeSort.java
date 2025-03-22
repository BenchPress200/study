package algorithm.sort;

public class MergeSort extends Sort {
    public MergeSort() {
        super("Merge");
    }
    @Override
    void run(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int start, int end) {
        // 정렬할 범위가 없을 경우 반환
        if(start >= end) {
            return;
        }

        // 반으로 쪼개기
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid); // 왼쪽
        mergeSort(arr, mid + 1, end); // 오른쪽
        merge(arr, start, mid, end); // 정렬하면서 병합
    }

    public void merge(int[] arr, int start, int mid, int end) {
        // 여기서 두 개의 배열은 각각 정렬이 돼 있는 상태
        // 결과저장용 임시 배열 선언
        int[] temp = new int[end - start + 1];
        int tempIdx = 0;

        int leftIdx = start;
        int rightIdx = mid + 1;

        // 두 배열 중에서 하나라도 값을 모두 옮긴다면 루프종료
        while(leftIdx <= mid && rightIdx <= end) {
            // 왼쪽 배열의 값이 더 작다면
            if(arr[leftIdx] <= arr[rightIdx]) {
                temp[tempIdx++] = arr[leftIdx++];
                continue;
            }

            // 오른쪽 배열의 값이 더 작다면
            if(arr[leftIdx] > arr[rightIdx]) {
                temp[tempIdx++] = arr[rightIdx++];
            }
        }

        // 두 배열 중에서 옮기지 않은 값 있다면 옮기기
        while(leftIdx <= mid) {
            temp[tempIdx++] = arr[leftIdx++];
        }

        while(rightIdx <= end) {
            temp[tempIdx++] = arr[rightIdx++];
        }

        // 임시배열을 진짜 배열에 복사
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }


}
