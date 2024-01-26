public class QueueLinkedList implements Queue{

    Node head=null;
    Node tail=null;


    int size=0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void addElement(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.node=newNode;
        tail=newNode;
        size=size+1;
    }

    @Override
    public void removeElememt() {
        if(head==null && tail==null){
            System.out.println("Queue is already empty");
            return;
        }else{
            head=head.node;
            size=size-1;
        }
    }

    @Override
    public int peek() {
        return head.data;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void printQueue() {
        if(isEmpty()){
            System.out.println("No Node present");
        }else{
            Node temp= head;
            System.out.print("Linked Queue is -> ");
            while (temp.node!=null){
                System.out.print(temp.data+" ");
                temp=temp.node;
            }
            System.out.print(temp.data+" ");
        }
    }

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();

        queueLinkedList.addElement(21);
        queueLinkedList.addElement(23);
        queueLinkedList.addElement(26);
        queueLinkedList.addElement(29);
        queueLinkedList.addElement(31);
        queueLinkedList.printQueue();
        System.out.println("\n"+queueLinkedList.size());
        queueLinkedList.removeElememt();
        queueLinkedList.removeElememt();
        queueLinkedList.printQueue();
        System.out.println("\n"+queueLinkedList.size());
    }
}
