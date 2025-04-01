package algorithm.primenumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 0 ~ 101까지 소수 판별
        int N = 100;
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= N; i++) {
            if(isPrime[i]) {
                for(int j = 2; j * i <= N; j++) {
                    isPrime[j*i] = false;
                }
            }
        }

        for(int i = 0; i <= N; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
