public class CircularQueue implements Queue{
    int front=-1;
    int rear=-1;
    int arr[];
    int size;

    long startTime;
    long endTime;
    long totalTime;

    CircularQueue(int lenght){
        arr = new int[lenght];
        size=lenght;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return (rear==-1 && front==-1);
    }

    @Override
    public void addElement(int data) {
        if(isFull()){
            System.out.println("Queue is full, Can't add "+data);
            return;
        }
        if(front==-1){
            front=0;
        }
        rear= (rear+1)%size;
        arr[rear]= data;
    }

    @Override
    public void removeElememt() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(rear==front){
            front=rear=-1;
        }
        front=(front+1)%size;
    }

    @Override
    public int peek() {
        return arr[front];
    }

    @Override
    public boolean isFull() {
        return ((rear+1)%size == front);
    }

    @Override
    public void printQueue() {
        int first=front;
        int last = rear;
        System.out.print("\nCircular Queue is -> ");
        while (first!=last){
            System.out.print(arr[first]+"->");
            first=(first+1)%size;
        }
        System.out.print(arr[first]+" ");
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.addElement(8);
        circularQueue.addElement(9);
        circularQueue.addElement(12);
        circularQueue.addElement(56);
        circularQueue.printQueue();
        circularQueue.removeElememt();
        circularQueue.printQueue();
        circularQueue.removeElememt();
        circularQueue.removeElememt();
        circularQueue.printQueue();
        circularQueue.addElement(19);
        circularQueue.addElement(112);
        circularQueue.addElement(156);
        circularQueue.printQueue();

    }
}
