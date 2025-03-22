package algorithm.sort;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort extends Sort{
    public RadixSort() {
        super("Radix");
    }

    @Override
    public void run(int[] arr) {
        // 최대 자릿수 구하기
        int digit = getMaxDigit(arr);
        int[] output = new int[arr.length];

        @SuppressWarnings("unchecked")
        Queue<Integer>[] bucket = new Queue[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<>();
        }

        int count = 1;

        while(count <= digit) { // 최대자릿수까지 반복
            for (int i = 0; i < arr.length; i++) {
                output[i] = arr[i];
            }

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < count-1; j++) {
                    output[i] /= 10;
                }

                bucket[output[i] % 10].add(arr[i]);
            }

            int index = 0;
            for(int i = 0; i < 10; i++) {
                Queue<Integer> curQ = bucket[i];

                while(!curQ.isEmpty()) {
                    arr[index++] = curQ.poll();
                }
            }

            count++;
        }



    }

    public int getMaxDigit(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 1;

        while(max / 10 != 0) {
            max /= 10;
            count++;
        }

        return count;
    }
}
