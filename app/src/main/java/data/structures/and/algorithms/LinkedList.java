package data.structures.and.algorithms;

import java.util.ArrayList;

public class LinkedList<T> {
    Node<T> head;
    int size;


    // Method for insert data in linkedList (at the end)
    public void Append(T value) {

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
        Node<T> tempRefForFirstValue;
        if(head.value == existNum){
            tempRefForFirstValue = head;
            head = node;
            head.next = tempRefForFirstValue;
        }

        Node<T> tempRef = head;
        Node<T> tempRef2 = tempRef;
        while (tempRef.value != existNum){
            tempRef2 = tempRef;
            tempRef = tempRef.next;
        }

        tempRef2.next = node;
        node.next = tempRef;

        return "Number Added";
    }


    public LinkedList<T> linkedListZip(LinkedList<T> one, LinkedList<T> two){

        Node<T> tempRefOne = one.head;
        Node<T> tempRefTwo = two.head;

        LinkedList<T> mergedList = new LinkedList<>();

        while (tempRefOne != null || tempRefTwo != null){
            if(tempRefOne != null){
                mergedList.Append(tempRefOne.value);
                tempRefOne = tempRefOne.next;
            }
            if(tempRefTwo != null){
                mergedList.Append(tempRefTwo.value);
                tempRefTwo = tempRefTwo.next;
            }
        }
        return mergedList;
    }


    /**
     *
     * @param k
     * @return the value of this index (index start from the end)
     */
    public T kthFromEnd(int k){
        if(k < 0 || head == null) {
            return null;
        }

        Node<T> tempRef = head;
        Node<T> tempRef2 = head;
        int count = 0;

        while(tempRef.next != null) {
            tempRef = tempRef.next;
            count++;
            if(count > k) {
                tempRef2 = tempRef2.next;
            }
        }

        if(count < k) {
            return null;
        }
        return tempRef2.value;

    }

    /**
     *  palindrome
     */
    public boolean palindrome(LinkedList<T> l){
        ArrayList<T> a = new ArrayList<>();
        Node<T> tempRef = l.head;

        while (tempRef != null){
           a.add(tempRef.value);
           head = head.next;
           tempRef =head;

        }
        return false;
    }


    /**
     * function for testing, returns the value of head, or returns null for an empty list.
     */
    public T getHeadValue() {
        if(this.head == null) {
            return null;
        }
        return this.head.value;
    }

    /**
     * function for testing, returns the last value in the list, or returns null for an empty list.
     */
    public T getLastValue() {
        if(this.head == null) {
            return null;
        }
        Node<T> tempRef = this.head;
        while(tempRef.next != null) {
            tempRef = tempRef.next;
        }
        return tempRef.value;
    }


}
