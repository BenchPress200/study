package algorithm.sort;

public class InsertionSort extends Sort{
    protected InsertionSort() {
        super("Insertion");
    }

    @Override
    public void run(int[] arr) {
        // 첫 번째 인덱스는 이미 정렬된 데이터로 판단하고 인덱스 1부터 시작
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i]; // 정렬한 영역에 들어갈 값
            int j = i - 1; // 정렬된 영역의 제일 큰 인덱스

            // j를 정렬된 범위 큰 인덱스부터 작은 인덱스 까지 탐색하면서 삽입할 자리 찾음
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j]; // 현재 선택된 값이 j에 있는 값보다 작다면 오른쪽으로 한 칸씩 밀기
                j--;
            }

            arr[j + 1] = value; // 삽입
        }
    }
}
