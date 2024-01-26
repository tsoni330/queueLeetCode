import java.util.*;
public class QueueUsing2Stack {

    Stack<Integer> s1= new Stack<Integer>();
    Stack<Integer> s2 = new Stack<>();

    public void addElement(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.add(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public void printQueue(){
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }

    public static void main(String[] args) {

        QueueUsing2Stack queueUsing2Stack = new QueueUsing2Stack();
        queueUsing2Stack.addElement(23);
        queueUsing2Stack.addElement(34);
        queueUsing2Stack.addElement(55);
        queueUsing2Stack.addElement(78);
        queueUsing2Stack.printQueue();
    }
}
