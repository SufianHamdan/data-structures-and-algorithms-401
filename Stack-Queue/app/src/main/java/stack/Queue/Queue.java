package stack.Queue;

public class Queue<T> {
    Node<T> front;
    Node<T> back;
    int size;

    public Queue(){
        front = new Node<>();
        back = front;
        size = 0;
    }


    public void enqueue(T value){
        Node<T> node = new Node<>(value);
        if (size == 0){
            front = node;
        } else{
            back.next = node;
        }
        back = node;
        size++;
    }

    public T dequeue() throws Exception {
        if(front == null){
            throw new Exception("Your Queue Is Empty!");
        }
        Node<T> tempRef= front;
        front = front.next;
        tempRef.next = null;
        size--;
        return tempRef.value;

    }

    public T peek() throws Exception {
        if(front == null){
            throw new Exception("Your Queue Is Empty!");
        }

        return front.value;
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (front == null) {
            return "Your queue Is Empty";
        }

        Node<T> tempRef = front;
        String print = "Front <- ";
        while (tempRef.next != null) {
            print = print + "{" + tempRef.value + "} <- ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} back -> Null";
        return print;
    }
}
