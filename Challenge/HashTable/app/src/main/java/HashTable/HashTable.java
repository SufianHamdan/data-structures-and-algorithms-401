package HashTable;

import HashTable.Data.HashNode;
import LinkedList.LinkedList;

import java.util.Objects;

public class HashTable<V> {

    private LinkedList<HashNode<V>> bucketArray;
    private int numBucket;
    private int size;


    public HashTable() {

        bucketArray = new LinkedList<HashNode<V>>();
        numBucket = 10;
        size = 0;

        for (int index = 0; index < numBucket; index++) {
            bucketArray.append(null);
        }

    }

    private int hashCode(String key) {
        return Objects.hashCode(key);
    }


    private int getBucketIndex(String key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBucket;
        index = index < 0 ? index * -1 : index;
        return Math.abs(index);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(String key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<V> newNode = new HashNode<>(key, value, hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex, newNode);
        resize();
    }

    private void resize() {
        if ((1.0 * size) / numBucket >= 0.7) {
            LinkedList<HashNode<V>> temp = bucketArray;
            bucketArray = new LinkedList<HashNode<V>>();
            numBucket *=  2;
            size = 0;

            for (int index = 0; index < numBucket; index++) {
                bucketArray.append(null);
            }

            for (int i = 0; i <= temp.getSize(); i++) {
                HashNode<V> headNode = temp.get(i);
                while (headNode != null) {
                    add(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }

        }
    }

    public V remove(String key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<V> head = bucketArray.get(bucketIndex);

        HashNode<V> prev = null;

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                break;
            }
            prev = head;
            head = head.getNext();
        }

        if (head == null) {
            return null;
        }

        size--;

        if (prev != null) {
            prev.setNext(head.getNext());
        } else {
            bucketArray.set(bucketIndex, head.getNext());
        }

        return head.getValue();
    }


    public V get(String key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.getValue();
            }
            head = head.getNext();
        }

        return null;
    }

    public void duplicatedWords(String UserWords){

        String[] words = UserWords.split(" ");
//        LinkedList<String> duplicated = new LinkedList<String>();

        HashTable<String> wordMap = new HashTable<String>();

        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); // for case insensitive comparison
            if(wordMap.get(word)!=null) {
                // we found a duplicated word!
                System.out.println("Duplicated/Repeated word:"+word.toLowerCase());
//                duplicated.add(word);
            }else {
                wordMap.add(word, word);
            }
        }
    }
}