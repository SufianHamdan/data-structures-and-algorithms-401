package data.structures.and.algorithms;

import java.util.ArrayList;

public class LinkedList<T> {
    Node<T> head;
    int size;


    /**
     * Function to insert new node in the end of the linkedList
     * @param value
     */
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

    /**
     * Function to check if value is included or not
     * @param value
     * @return true, false
     */
    public boolean isIncluded(T value){
//
        if(head == null){
            return false;
        }

        Node<T> tempRef = head;

            while (tempRef != null) {

                if (tempRef.value == value) {
                    return true;
                }
                tempRef = tempRef.next;
            }
        return false;
    }

    /**
     * This fucntion for printing out the data in the list
     * @return text
     */

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

    /**
     * This function insert a new node at the front of the linked list
     * @param value
     */
    public void insert(T value){
        Node<T> newNode = new Node<>(value);
        if(size == 0){
            head = newNode;
        }else{
            Node<T> tempRef = head;
            head = newNode;
            newNode.next = tempRef;
        }
    }

    /**
     * This function returns the size of the list
     */
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

    /**
     * This function insert new node before specified node
     * @param existNum
     * @param newValue
     * @return text if its added or the number doesn't exist
     */

    public String insertBefore(T existNum, T newValue){

        boolean trueFalse = this.isIncluded(existNum);
        if(!trueFalse){
            return "Number doesn't exist";
        }
        Node<T> node = new Node<>(newValue);
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

    public String insertAfter(T existNum, T newValue){
        boolean trueFalse = this.isIncluded(existNum);
        if(!trueFalse){
            return "Number doesn't exist";
        }
        Node<T> newNode = new Node<>(newValue);
        Node<T> tempRefForFirstValue;
        if(head.value == existNum){
            tempRefForFirstValue = head;
            head = newNode;
            head.next = tempRefForFirstValue;
        }

    }

    /**
     * This function merge 2 linked list 1 value from each one at a time
     * @param one
     * @param two
     * @return new merged linked list
     */

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
     * This function returns the value of specified index but index start from the end
     * @param k
     * @return the value of this index
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
