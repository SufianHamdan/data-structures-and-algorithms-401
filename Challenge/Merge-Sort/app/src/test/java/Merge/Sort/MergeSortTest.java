/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Merge.Sort;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MergeSortTest {
    int[] emptyArray;
    int[] reverseSorted;
    int[] fewUniques;
    int[] nearlySorted;

    @Before
    public void init(){
        emptyArray = new int[0];
        reverseSorted = new int[]{20, 18, 12, 8, 5, -2};
        fewUniques = new int[]{5,12,7,5,5,7};
        nearlySorted = new int[]{2,3,5,7,13,11};
    }

    @Test
    public void testEmptyArray() {
        assertNull(MergeSort.mergeSort(emptyArray));
    }

    @Test
    public void testReverseSorted() {
        assertEquals("[-2, 5, 8, 12, 18, 20]", MergeSort.mergeSort(reverseSorted));
    }

    @Test
    public void testFewUniques() {
        assertEquals("[5, 5, 5, 7, 7, 12]", MergeSort.mergeSort(fewUniques));
    }

    @Test
    public void testNearlySorted() {
        assertEquals("[2, 3, 5, 7, 11, 13]", MergeSort.mergeSort(nearlySorted));
    }


}