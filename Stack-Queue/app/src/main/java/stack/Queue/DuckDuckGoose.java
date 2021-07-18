package stack.Queue;


import java.util.ArrayList;
import java.util.List;

public class DuckDuckGoose<T> {

    public static void main(String[] args) throws Exception {

        List<String> people = new ArrayList<>();
        people.add("A");
        people.add("B");
        people.add("C");
        people.add("D");
        people.add("E");
        people.add("F");

        Queue<String> test = new Queue<>();
        System.out.println(test.duckDuckGoose(people, 3));
    }
//
//    public static String duckDuckGoose(List<String> people, int k) throws Exception {
//        Queue<String> test = new Queue<>();
//        for(String p: people){
//            test.enqueue(p);
//        }
//        int kCount = 0;
//        while (kCount != 100){
//
//            if(kCount == k){
//
//            }
//
//        }

}
