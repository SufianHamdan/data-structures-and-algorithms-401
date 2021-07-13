package stack.Queue;

public class Stack<T> {
    Node<T> top;
    int size;

    public void push(T value){
        Node<T> n =  new Node<>(value);
        if(top == null){
            top = n;
        }else{
            Node<T> tempRef = top;
            top = n;
            top.next = tempRef;
        }
        size++;
    }

    /**
     * helper function for multi brackets class
     * @param value
     */
    public void pushChar(char value){
        Node<Character> n =  new Node<>(value);
        if(top == null){
            top = (Node<T>) n;
        }else{
            Node<T> tempRef = top;
            top = (Node<T>) n;
            top.next = tempRef;
        }
        size++;
    }

    /**
     * helper function for multi brackets class
     * @param
     */
    public char popChar(){
        if(top == null){
            return 'n';
        }

        Node<T> tempRef = top;
        top = top.next;
        tempRef.next = null;
        size--;
        return (char) tempRef.value;
    }



    public T pop(){
        if(top == null){
            return null;
        }

        Node<T> tempRef = top;
        top = top.next;
        tempRef.next = null;
        size--;
        return tempRef.value;
    }

    public T peek() throws Exception {
        if(top == null){
            throw new Exception("Your Stack is Empty");
        }

        return top.value;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }


    public String toString(){
        if(isEmpty()){
            return "Your List Is Empty";
        }

        Node<T> tempRef = top;
        String print = "Top -> ";
        while (tempRef.next != null){
            print = print + "{" + tempRef.value + "} -> ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} -> Null";
        return print;
    }

}
