/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMapLeftJoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> synonym = new HashMap<>();
        HashMap<String,String> antonym = new HashMap<>();

        synonym.put("fond", "enamored");
        synonym.put("wrath", "anger");
        synonym.put("diligent", "employed");
        synonym.put("outfit", "garb");
        synonym.put("guide", "usher");

        antonym.put("fond", "averse");
        antonym.put("wrath", "delight");
        antonym.put("diligent", "idle");
        antonym.put("guide", "follow");
        antonym.put("flow", "jam");

        App app = new App();


        System.out.println(app.hashMapLeftJoin(synonym,antonym));
    }

    public List<List<String>> hashMapLeftJoin(HashMap<String,String> synonym, HashMap<String,String> antonym){
        List<List<String>> result = new ArrayList<>();

        for (String word: synonym.keySet()) {
            List<String> temp = new ArrayList<>();
            temp.add(word);
            temp.add(synonym.get(word));
            temp.add(antonym.get(word));

            result.add(temp);
        }

        return result;
    }
}