/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private PseudoQueue<Integer> pq;

    // Stack Tests


    @Test void testStackPush() {
        stack = new Stack<Integer>();
        stack.push(5);
        assertEquals("Top -> {5} -> Null", stack.toString());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        assertEquals("Top -> {8} -> {7} -> {6} -> {5} -> Null", stack.toString());
    }

    @Test void testStackPop() {
        stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test void testStackPeek() throws Exception {
        stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.peek());
        stack.pop();
        stack.pop();
        /*
            i don't know how to test the Exception message
         */
//        assertEquals("Your Stack is Empty", stack.peek());
    }

    //Queue Tests

    @Test void testQueueEnqueue() {
        queue = new Queue<>();
        queue.enqueue(1);
        assertEquals("Front <- {1} back -> Null", queue.toString());
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals("Front <- {1} <- {2} <- {3} back -> Null", queue.toString());

    }

    @Test void testQueueDequeue() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        queue.enqueue(3);
        assertEquals("Front <- {2} <- {3} back -> Null", queue.toString());
    }

    @Test void testQueuePeek() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());

        // isEmpty Test
        assertEquals(false, queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }

    /**
     * Testing PseudoQueue
     */
    @Test void testEnqueue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        assertEquals("[3, 2, 1]", pq.toString());
    }

    @Test void testDequeue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.dequeue();
        assertEquals("[3, 2]", pq.toString());
        pq.dequeue();
        pq.dequeue();
        assertEquals("[]", pq.toString());
    }

//    @Test void testAnimalShelter


}
