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



    public T pop(){
        if(top == null){
            return null;
        }

        Node<T> tempRef = top;
        top = top.next;
        tempRef.next = null;

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
        if(top == null){
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




