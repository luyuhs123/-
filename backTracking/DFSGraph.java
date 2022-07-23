package backTracking;

import java.util.*;

/**
 * @auther luyu
 * 图的深度优先遍历以及广度优先遍历
 */
public class DFSGraph {
    static List<Integer> temp = new LinkedList<>();
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[][] graph = {{0,1,1,1,0},{1,0,1,1,0},{1,1,0,1,1},{1,1,1,0,0},{0,0,1,0,0}};
        int[] used = new int[graph[0].length];
        BFSGraph(used,graph,4);
        for (Integer integer : temp) {
            System.out.println(integer);
        }
    }

    public static void DFSGraph(int[] used,int startIndex,int[][] graph){
        int[] lineGraph = graph[startIndex-1];
        for (int i = 0; i < lineGraph.length; i++) {
            if(lineGraph[i]==1&&used[i]==0){
                DFSGraph(used,i+1,graph);
            }
            else {
                continue;
            }
        }
    }

    public static void BFSGraph(int[] used,int[][] graph,int startIndex){
        Deque<Integer> deque = new ArrayDeque();
        deque.add(startIndex);
        used[startIndex-1]=1;
        while(!deque.isEmpty()){
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Integer remove = deque.remove();
                temp.add(remove);
                int[] lineGraph = graph[remove-1];
                for (int j = 0; j < lineGraph.length; j++) {
                    if(used[j]==0&&lineGraph[j]==1){
                        deque.add(j+1);
                        used[j]=1;
                    }
                }
            }
        }
    }

}
