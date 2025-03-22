package algorithm.sort;

public class BubbleSort extends Sort {
    public BubbleSort() {
        super("Bubble");
    }

    @Override
    public void run(int[] arr) {
        int range = arr.length - 1; // 정렬 범위 초기 설정

        while(range > 0) { // 정렬할 범위가 0이 될 때까지 진행
            for (int i = 0; i < range; i++) { // 마지막 인덱스 이전까지 순회
                if(arr[i] > arr[i+1]) { // 다음 데이터가 현재 데이터보다 작다면 스왑
                    swap(arr, i, i+1);
                }
            }

            range--; // 정렬범위 축소
        }
    }

    @Override
    public void runOpt(int[] arr) {
        int range = arr.length - 1; // 정렬 범위 초기 설정

        while (range > 0) { // 정렬할 범위가 0이 될 때까지 진행
            boolean swapped = false; // 조기 종료를 위한 스왑확인 변수

            for (int i = 0; i < range; i++) { // 마지막 인덱스 이전까지 순회
                if (arr[i] > arr[i+1]) { // 다음 데이터가 현재 데이터보다 작다면 스왑
                    swap(arr, i, i+1);
                    swapped = true;
                }
            }

            if (!swapped) { // 해당 범위에서 스왑된 적이 없다면 이미 정렬완료된 상태
                break;
            }

            range--; // 정렬범위 축소
        }
    }
}
