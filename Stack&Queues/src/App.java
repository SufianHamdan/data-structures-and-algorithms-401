public class App {
    public static void main(String[] args) throws Exception {

        /*
        Stack<String> s = new Stack<String>();

        s.push("s");
        s.push("u");
        s.push("f");
        s.push("i");
        s.push("a");
        s.push("n");

        System.out.println("Your New List Is: " + s.toString());
        System.out.println("First element is: " + s.peek());
        System.out.println("<<< POPPING First Value >>>");
        System.out.println("Popped Value is: " + s.pop());
        System.out.println("Your New List Is: " + s.toString());
        System.out.println("Is The Stack Empty: " + s.isEmpty());
        System.out.println("First element is: " + s.peek());

         */

        Queue<String> q = new Queue<>();
        q.enqueue("s");
        q.enqueue("u");
        q.enqueue("f");
        q.enqueue("i");
        q.enqueue("a");
        q.enqueue("n");

        System.out.println(q.toString());
        System.out.println(q.dequeue());
    }
}