/*155. Min Stack
     Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

*/
import java.util.*;


public class MinStack {

    private class StackNode {
        private int data;
        private int min;
        private StackNode next;
        
        public StackNode(int data, int min) {
            this.data = data;
            this.min = min;
        }
    }  

    private StackNode top;

    /** initialize your data structure here. */
    public MinStack() {}
    
    public void push(int x) {
        if (top == null) {
            StackNode newTop = new StackNode(x, x);
            top = newTop;
        } else {
            StackNode newTop = new StackNode(x, Math.min(x, top.min));
            newTop.next = top;
            top = newTop;
        }
    }
    
    public void pop() {
        if (top == null) {
            return;
        } else {
            top = top.next;
        }
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

