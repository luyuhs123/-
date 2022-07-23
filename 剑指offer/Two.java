package 剑指offer;

import java.util.Stack;

/**
 * @auther luyu
 */
public class Two {
    static class MinStack {

        Stack<Integer> dataStack = new Stack();
        Stack<Integer> supStack = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            dataStack.push(x);
            if(supStack.empty()){
                supStack.push(x);
            }
            else {
                if(supStack.peek()>=x){
                    supStack.push(x);
                }
            }
        }

        public void pop() {
            Integer pop = dataStack.pop();
            if (supStack.peek().equals(pop)){
                supStack.pop();
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            return supStack.peek();
        }
    }
}
