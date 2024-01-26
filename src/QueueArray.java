public class QueueArray implements Queue{
    int arr[];
    int size;
    int rear=-1;


    long startTime;
    long endTime;

    QueueArray(int length){
        this.arr = new int[length];
        size=-1;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size==-1);
    }

    @Override
    public void addElement(int data) {
        if(isFull()){
            System.out.println("Queue is full.. Can't enter "+data);
            return;
        }
        size=size+1;
        arr[size]=data;
    }

    @Override
    public void removeElememt() {
        startTime=System.nanoTime();
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i=0;i<size;i++){
            arr[i]=arr[i+1];
        }
        size=size-1;
        endTime=System.nanoTime();
        System.out.println("\nExecution time is "+(endTime-startTime));
    }

    @Override
    public int peek() {
        return arr[0];
    }

    @Override
    public boolean isFull() {
        return (size==arr.length-1);
    }

    @Override
    public void printQueue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("The Queue element is -> ");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray array = new QueueArray(4);
        array.addElement(45);
        array.addElement(57);
        array.addElement(35);
        array.addElement(87);
        array.printQueue();
        array.removeElememt();
        array.printQueue();


    }
}
