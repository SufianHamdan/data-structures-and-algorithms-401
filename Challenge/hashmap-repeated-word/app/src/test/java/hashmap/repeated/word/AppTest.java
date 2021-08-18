/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated.word;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();


    @Test
    public void repeatedWord(){

        String sentence1 = "Once upon a time, there was a brave princess who...";
        String sentence2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String sentence3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        String test1 = app.hashmapRepeatedWord(sentence1);
        String test2 = app.hashmapRepeatedWord(sentence2);
        String test3 = app.hashmapRepeatedWord(sentence3);

        assertEquals("a", test1, "repeatedWord test should return 'a'");
        assertEquals("it", test2, "repeatedWord test should return 'it'");
        assertEquals("summer", test3, "repeatedWord test should return 'summer'");
    }
}
