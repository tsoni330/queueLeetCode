import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Queue {


    public void interleave(Queue<Integer> q2){
        int size = q2.size();
        Queue<Integer> q1 = new LinkedList<>();
        for(int i=0;i<size/2;i++){
            q1.add(q2.remove());
        }
        while (!q1.isEmpty()){
            q2.add(q1.remove());
            q2.add(q2.remove());
        }
        System.out.println("The queue is "+q2);
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        Interleave2Queue interleave2Queue = new Interleave2Queue();
        interleave2Queue.interleave(q1);
    }
}
