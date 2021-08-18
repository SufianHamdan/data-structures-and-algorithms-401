import HashTable.HashTable;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {

    @Test
    public void addTest(){
        HashTable<String, Integer> hashTable = new HashTable<String, Integer>();
        hashTable.add("Sufian",55);
        hashTable.add("Hamdan",66);

        assertNotNull(hashTable.contains("Sufian"));
        assertTrue(hashTable.contains("Sufian"));
        assertEquals(55, hashTable.get("Sufian"));
        assertNull(hashTable.get("Ali"));
    }

    @Test
    public void collisionTest(){
        System.out.println(Objects.hashCode("FB"));
        System.out.println(Objects.hashCode("Ea"));

        HashTable<String, Integer> hashTable = new HashTable<String, Integer>();
        hashTable.add("Sufian",55);
        hashTable.add("Hamdan",66);
        hashTable.add("FB",10);
        hashTable.add("Ea",20);

        assertTrue(hashTable.contains("FB"));
        assertTrue(hashTable.contains("Ea"));

        assertEquals(10, hashTable.get("FB"));
        assertEquals(20, hashTable.get("Ea"));

    }
}