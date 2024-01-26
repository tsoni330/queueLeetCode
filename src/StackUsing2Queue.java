import java.util.*;
import java.util.Queue;

public class StackUsing2Queue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return (q1.isEmpty() && q2.isEmpty());
    }
    public void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else q2.add(data);
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while (!q1.isEmpty()){
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
            while (!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public static void main(String[] args) {

        StackUsing2Queue stackUsing2Queue = new StackUsing2Queue();
        stackUsing2Queue.push(1);
        stackUsing2Queue.push(2);
        stackUsing2Queue.push(3);
        stackUsing2Queue.push(4);
        stackUsing2Queue.push(5);

        while (!stackUsing2Queue.isEmpty()){
            System.out.println(stackUsing2Queue.pop());
        }

    }


}
