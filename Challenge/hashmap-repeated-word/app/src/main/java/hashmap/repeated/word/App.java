/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated.word;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.hashmapRepeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }

    public String hashmapRepeatedWord(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : sentence.split(" ")){
            if (word.endsWith(",")){
                word = removeLastChar(word);
            }
            int count = hashMap.get(word.toLowerCase()) != null ? hashMap.get(word) : 0;
            if (count == 1){
                return word;
            }
            hashMap.put(word.toLowerCase(), count + 1);
        }

        return null;
    }

    public String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }
}
