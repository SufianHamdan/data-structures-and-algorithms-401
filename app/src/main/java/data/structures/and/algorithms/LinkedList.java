package data.structures.and.algorithms;

public class LinkedList<T> {
    Node<T> head;
    int size;


    // Method for insert data in linkedlist
    public void insert(T value) {

        Node<T> newNode = new Node<>(value);

//        newNode.value = value;

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> tempRef = this.head;
            while(tempRef.next != null){
                tempRef = tempRef.next;
            }
            tempRef.next = newNode;
        }
        size++;
    }

    //Method to check if value is included or not(return true, false)
    public boolean isIncluded(T value){
//
//        if(this.head == null){
//            return false;
//        }

        Node<T> tempRef = this.head;

        if(size != 0) {
            while (tempRef != null) {

                if (tempRef.value == value) {
                    return true;
                }
                tempRef = tempRef.next;
            }
        }
        return false;
    }

    public String toString(){

        Node<T> tempRef = this.head;
        if(this.head == null){
            return "Your List Empty";
        }

        String result="";
        while(tempRef.next != null){

            result = result + "{" + tempRef.value + "} -> ";
            tempRef = tempRef.next;
        }
        return result + "{" + tempRef.value + "} -> Null";
    }

    //Method returns the size of the list
    public void size(){

        if(head.next == null){
            System.out.println("List is empty");
        }else {
            System.out.println(size);
        }
    }

    //Method changes index value at position(override value)
    public void ChangeValueAtPosition(int position, T value){
        Node<T> tempRef = this.head;
        int count = 1;
        if(this.head == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        if(position > size){
            System.out.println("Your Position is out of bounds");
            return;
        }

        while(tempRef.next != null){
            if(position == 1){
                tempRef.value = value;
                break;
            }
            tempRef = tempRef.next;
            count++;
            if(position == count){
                tempRef.value = value;
            }
        }
        System.out.println(value + " added at position " + position);

    }

}
