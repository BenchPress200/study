package algorithm.sort;

public class InsertionSort {
    public void run(int[] arr) {

        // 첫 번째 인덱스는 이미 정렬된 데이터로 판단하고 인덱스 1부터 시작
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 정렬할 원소
            int j = i - 1; // 정렬된 영역의 제일 큰 인덱스

            // 삽입 인덱스가 0 보다 크고 키보다 크다면 오른쪽으로 밀기
            while (j >= 0 && arr[j] > key) { // key 보다 큰 원소는 한 칸씩 뒤로 이동
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // 삽입
        }
    }
}
