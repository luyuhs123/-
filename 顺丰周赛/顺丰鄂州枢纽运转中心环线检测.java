package 顺丰周赛;

import java.util.*;

/**
 * @auther luyu
 */
public class 顺丰鄂州枢纽运转中心环线检测 {
    public static void main(String[] args) {
        String s = "1->4,2->5,3->6,3->7,4->8,5->8,5->9,6->9,6->11,7->11,8->12,9->12,9->13,10->13,10->14,11->10,11->14";
        boolean b = hasCycle(s);
        System.out.println(b);
    }
    public static boolean hasCycle(String graph) {
//        hash表，存对应关系
        HashMap<Integer,List<Integer>> rudu = new HashMap<>();
        HashMap<Integer,List<Integer>> chudu = new HashMap<>();
        String[] split = graph.split(",");
//        记录数组长度
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            int start = Integer.parseInt(s.substring(0,s.indexOf("-")));
            int end = Integer.parseInt(s.substring(s.indexOf(">")+1));
            if(rudu.get(end-1)==null){
                List<Integer> temp = new ArrayList<>();
                temp.add(start-1);
                rudu.put(end-1,temp);
            }
            else {
                List<Integer> temp = rudu.get(end-1);
                temp.add(start-1);
                rudu.put(end-1,temp);
            }
            if(chudu.get(start-1)==null){
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(end-1);
                chudu.put(start-1,temp2);
            }
            else {
                List<Integer> temp2 = chudu.get(start-1);
                temp2.add(end-1);
                chudu.put(start-1,temp2);
            }
                max = Math.max(max,Math.max(start,end));
        }
        int[] degree = new int[max];
        int num=0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if(rudu.get(i)==null){
                degree[i]=0;
            }else {
                degree[i] = rudu.get(i).size();
            }
        }
        for (int i = 0; i < degree.length; i++) {
            if(degree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            Integer remove = queue.remove();
            List<Integer> list = chudu.get(remove);
            if(list!=null){
                for (Integer integer : list) {
                    degree[integer]--;
                    if(degree[integer]==0){
                        queue.offer(integer);
                    }
                }
            }
            num++;
        }
        return num != degree.length;
    }
}





