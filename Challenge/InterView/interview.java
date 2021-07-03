import java.util.LinkedList;

public class interviewQues{

    public static void main(String[] args) {

        System.out.println(fibRecursive(13));


    }

    public static int fibNormalSolution(int fibNum){

        int [] fib = new int[fibNum + 1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i =2; i < fibNum + 1; i++){

            fib[i] = fib[i -1] + fib[i - 2];
        }

        return fib[fibNum];
    }


    public static int fibRecursive(int fibNum){

        if(fibNum == 0){
            return 0;
        }
        if(fibNum == 1 || fibNum == 2){
            return 1;
        }
        return fibRecursive(fibNum-2) + fibRecursive(fibNum-1);
    }
