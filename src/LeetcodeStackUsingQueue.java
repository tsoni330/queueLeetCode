import java.util.LinkedList;
import java.util.Queue;

public class LeetcodeStackUsingQueue {
    Queue<Integer> q1 = new LinkedList();
    Queue<Integer> q2 = new LinkedList();

    public void push(int x) {

        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }

    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        LeetcodeStackUsingQueue leetcodeStackUsingQueue = new LeetcodeStackUsingQueue();
        leetcodeStackUsingQueue.push(1);
        leetcodeStackUsingQueue.push(2);
        leetcodeStackUsingQueue.push(3);
        leetcodeStackUsingQueue.push(4);
        leetcodeStackUsingQueue.push(34);

        System.out.println("Thge top is "+leetcodeStackUsingQueue.top());
        System.out.println("Thge pop is "+leetcodeStackUsingQueue.pop());

    }
}
