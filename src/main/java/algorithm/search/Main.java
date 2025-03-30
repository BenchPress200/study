package algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DFS dfs = new DFS();
        BFS bfs = new BFS();
        BinarySearch binarySearch = new BinarySearch();

        // 0 ~ 9번 정점을 가지는 그래프
        List<Integer>[] graph = getGraph();

        // DFS
        int[] result = dfs.run(graph);
        printTestResult(result, "DFS");

        // BFS
        result = bfs.run(graph);
        printTestResult(result, "BFS");

        // BinarySearch
        System.out.println("Binary Search");
        int target = 5;
        int[] arr = createRandomArray();
        System.out.println("target: " + target);
        System.out.print("arr: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int targetIndex = binarySearch.run(arr, target);
        System.out.println("Target Index: " + targetIndex);
    }

    private static int[] createRandomArray() {
        List<Integer> candidates = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            candidates.add(i);
        }

        Collections.shuffle(candidates); // 리스트를 랜덤하게 섞음

        int[] result = new int[10];

        for (int i = 0; i < 10; i++) {
            result[i] = candidates.get(i);
        }

        Arrays.sort(result);
        return result;
    }

    private static List<Integer>[] getGraph() {
        // 0 ~ 9번 정점
        List<Integer>[] graph = new List[10];

        for (int i = 0; i < 10; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[1].add(2);
        graph[1].add(3);
        graph[2].add(4);
        graph[3].add(5);
        graph[3].add(6);
        graph[3].add(7);
        graph[1].add(8);
        graph[4].add(9);

        return graph;
    }

    private static void printTestResult(int[] arr ,String name) {
        System.out.println(name);
        System.out.print("visit order: ");
        printArray(arr);
        System.out.println();
    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
