package algorithm.sort;

public class QuickSort extends Sort {
    public QuickSort() {
        super("Quick");
    }

    @Override
    public void run(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int left, int right) {
        // 왼쪽인덱스가 오른쪽 인덱스와 같거나 크다면 종료
        if(left >= right) {
            return;
        }

        int pivot = partition(arr, left, right); // 자리가 정해진 피벗
        quickSort(arr, left, pivot-1); // pivot 기준 왼쪽 퀵 정렬 진행
        quickSort(arr, pivot+1, right); // pivot 기준 오른쪽 퀵 정렬 진행
    }

    private int partition(int[] arr, int left, int right) {
        // 피벗 선정
        int pivot = right;
        int pivotValue = arr[right--]; // 피벗값 할당하고 오른쪽 포인터 --

        while(left < right) {
            // 피벗값이 왼쪽값 보다 큰 경우 스왑 필요 없으므로 이동
            if(pivotValue > arr[left]) {
                left++;
                continue;
            }

            // 피벗값이 오른쪽값 보다 작은 경우 스왑 필요 없으므로 이동
            if(pivotValue < arr[right]) {
                right--;
                continue;
            }

            // 왼쪽은 피벗보다 크고 오른쪽은 피벗보다 작을 때 스왑진행
            if(pivotValue < arr[left] && pivotValue > arr[right]) {
                swap(arr, left++, right--);
            }
        }

        // 왼쪽 오른쪽이 같은 곳에 멈췄고 해당 인덱스 값이 피봇보다 크다면
        // 피봇은 제일 오른쪽 값을 선택했기 때문에 큰 값을 옮겨야 함
        if(left == right && arr[left] > pivotValue) {
            swap(arr, left, pivot);
            return left;
        } else {
            // left, right 인덱스가 같지 않다면 right+1 이 가리키는 값은 피봇보다 큰 값임
            swap(arr, right+1, pivot);
            return right+1;
        }
    }
}
