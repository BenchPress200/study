package algorithm.search;

public class BinarySearch {
    public int run(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int center = (start + end) / 2; // 중앙 인덱스

            if(arr[center] == target) { // 타겟을 찾았다면
                return center;
            }

            if(arr[center] < target) { // 타겟보다 센터값이 작다면
                start = center + 1;
            } else { // 타겟보다 센터값이 크다면
                end = center - 1;
            }
        }

        return -1;
    }
}
