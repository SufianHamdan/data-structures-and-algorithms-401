/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import HashTable.HashTable;

public class App {

    public static void main(String[] args) {

        HashTable<String, Integer> hashTable = new HashTable<String, Integer>();
        hashTable.add("John", 300);
        hashTable.add("Sally", 400);
        hashTable.add("Tom", 200);
        hashTable.add("Jade", 100);

        System.out.println("The size is => " + hashTable.getSize());
        System.out.println("The Sally allowance is => " + hashTable.get("Sally"));
        System.out.println("Is Sally here => " + hashTable.contains("Sally"));
        System.out.println("Is Sufian here => " + hashTable.contains("Sufian"));
        System.out.println("Delete Sally => " + hashTable.remove("Sally"));
        System.out.println("The size is => " + hashTable.getSize());

    }
}
