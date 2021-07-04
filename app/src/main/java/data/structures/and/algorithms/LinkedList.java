package data.structures.and.algorithms;

public class LinkedList<T> {
    Node<T> head;
    int size;


    // Method for insert data in linkedlist (at the end)
    public void insert(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> tempRef = head;
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
        if(head == null){
            return false;
        }

        Node<T> tempRef = head;

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


        if(head == null){
            return "Your List Empty";
        }
        Node<T> tempRef = head;
        String result="";
        while(tempRef != null){

            result = result + "{" + tempRef.value + "} -> ";

            tempRef = tempRef.next;
        }
        return result +  "Null";
    }

    //Method returns the size of the list
    public void size(){

        if(head == null){
            System.out.println("List is empty");
        }else {
            System.out.println(size);
        }
    }

    //Method changes index value at position(override value)
    public void ChangeValueAtPosition(int position, T value){
        Node<T> tempRef = head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position > size){
            System.out.println("Your Position is out of bounds");
            return;
        }
        int count = 1;
        while(tempRef != null){

            if(position == count){
                tempRef.value = value;
            }
            tempRef = tempRef.next;
        }
        System.out.println(value + " added at position " + position);

    }

    public String insertBefore(T existNum, T valuebeforeExistNum){

        boolean trueFalse = this.isIncluded(existNum);
        if(!trueFalse){
            return "Number doesn't exist";
        }
        Node<T> node = new Node<>(valuebeforeExistNum);
        Node tempRef = head;
        Node tempRef2 = tempRef;
        while (tempRef.value != existNum){
            tempRef2 = tempRef;
            tempRef = tempRef.next;
        }

        tempRef2.next = node;
        node.next = tempRef;

        return "Number Added";
    }

}
