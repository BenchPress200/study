package algorithm.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    public int[] run(List<Integer>[] graph) {
        int n = graph.length; // 정점의 개수
        boolean[] visited = new boolean[n]; // 각 정점의 방문여부

        return dfs(0, graph, visited); // 깊이우선탐색 진행
    }

    private int[] dfs(int start, List<Integer>[] graph, boolean[] visited) {
        List<Integer> order = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            int cur = stack.pop();
            order.add(cur);

            for(Integer next : graph[cur]) {
                if(!visited[next]) {
                    stack.push(next);
                    visited[next] = true;
                }
            }
        }

        int[] result = new int[order.size()];

        for (int i = 0; i < order.size(); i++) {
            result[i] = order.get(i);
        }

        return result;
    }
}
