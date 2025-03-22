package algorithm.sort;

public class SelectionSort extends Sort {
    public SelectionSort() {
        super("Selection");
    }

    @Override
    public void run(int[] arr) {
        // 시작범위는 0 부터 끝까지
        // start 에 삽입할 값 찾기
        int start = 0;

        while(start < arr.length) {
            int selectedIdx = start; // 현재 선택 인덱스
            int selectedValue = arr[selectedIdx]; // 현재 선택 값

            for (int i = start; i < arr.length; i++) {
                if(arr[i] < selectedValue) { // 선택한 값 보다 작은 값을 발견했다면
                    selectedIdx = i; // 갱신
                    selectedValue = arr[i];
                }
            }

            swap(arr, start, selectedIdx); // start 자리에 찾은 최소값 스왑
            start++; // 다음 자리로 이동
        }

    }
}
