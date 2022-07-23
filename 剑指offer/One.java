package 剑指offer;

import java.util.Stack;

/**
 * @auther luyu
 */
public class One {
    static class CQueue {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        public CQueue() {
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack2.size()==0&&stack1.size()==0){
                return -1;
            }
            else if(stack2.size()==0){
                int times = stack1.size();
                for (int i = 0; i < times; i++) {
                    Integer pop = stack1.pop();
                    stack2.push(pop);
                }
                return stack2.pop();
            }
            else {
                return stack2.pop();
            }
        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

    }


}
