/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge41;

public class App {


    public static void main(String[] args) {

        Navigator n = new Navigator();
        n.go("jordan");
        n.go("palestine");
        n.go("syria");
        n.go("iraq");
        System.out.println(n.getAllLocation());
        System.out.println(n.forward() +" should be null");
        System.out.println(n.back() +" should be syria");
        System.out.println(n.back() +" should be palestine");
        System.out.println(n.forward() +" should be syria");
        System.out.println(n.forward() +" should be iraq");
        System.out.println(n.back() +" should be syria");
        n.go("yemen");
        System.out.println(n.getAllLocation());
        System.out.println(n.back() +" should be syria");
        System.out.println(n.back() +" should be palestine");
        System.out.println(n.back() +" should be jordan");
        n.go("lebanon");
        System.out.println(n.getAllLocation());
    }
}
