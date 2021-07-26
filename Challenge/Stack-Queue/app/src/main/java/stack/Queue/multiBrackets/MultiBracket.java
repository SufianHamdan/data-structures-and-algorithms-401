package stack.Queue.multiBrackets;

import stack.Queue.Stack;

public class MultiBracket {



    public static boolean validateBrackets(String bracket){

        Stack<String> brackets = new Stack<String>();


        for(int index =0; index < bracket.length(); index++){

            if(isClosingBracket(bracket.charAt(0))){
                return false;
            }
            if(isOpenBracket(bracket.charAt(index))){
                brackets.pushChar(bracket.charAt(index));
            }else if(isClosingBracket(bracket.charAt(index))){
                if(!match(brackets.popChar(), bracket.charAt(index))) {
                    return false;
                }
            }

        }
        return true;

    }

    public static boolean isClosingBracket(char bracket){
        return bracket == ')' || bracket == ']' || bracket == '}';
    }

    public static boolean isOpenBracket(char bracket){
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    public static boolean match(char o, char c){
        if(o == '(' && c == ')'){
            return true;
        }
        if(o == '[' && c == ']'){
            return true;
        }
        if(o == '{' && c == '}'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String test1 = "{}(){}";
        String test2 = "()[[Extra Characters]]";
        String test3 = "(){}[[]]";
        String test4 = "{}{Code}[Fellows](())";
        String test5 = "[({}]";
        String test6 = "(](";
        String test7 = "{(})";
        System.out.println(validateBrackets(test1));
        System.out.println(validateBrackets(test2));
        System.out.println(validateBrackets(test3));
        System.out.println(validateBrackets(test4));
        System.out.println(validateBrackets(test5));
        System.out.println(validateBrackets(test6));
        System.out.println(validateBrackets(test7));
    }


}
