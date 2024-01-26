public interface Queue {

    int size();
    boolean isEmpty();
    void addElement(int data);
    void removeElememt();
    int peek();
    boolean isFull();

    void printQueue();

}
