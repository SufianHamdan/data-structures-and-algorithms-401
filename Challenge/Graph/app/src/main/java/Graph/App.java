/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class App {

    private Integer totalCost = 0;

    public static void main(String[] args) throws Exception {
            GraphClass graph = new GraphClass();

//    graph.addVertex("Sufian");
//    graph.addVertex("Ali");
//    graph.addVertex("Ahmad");
//    graph.addVertex("Omar");
//
//    graph.addEdge("Sufian", "Omar", 3);
//    graph.addEdge("Sufian", "Ahmad", 4);
//    graph.addEdge("Ahmad", "Ali");
//
//    System.out.println(graph.printGraph());
//    System.out.println();
//
////    graph.removeVertex("Ahmad");
////    graph.removeEdge("Ahmad", "Omar");
//
//    System.out.println(graph.printGraph());
//    System.out.println(graph.size());
//    System.out.println(graph.getNeighbors("Ali"));
//    System.out.println();
//    System.out.println(graph.depthFirstTraverse("Sufian"));
//    System.out.println(graph.breadthTraverse("Sufian"));



    GraphClass citiesGraph = new GraphClass();
    citiesGraph.addVertex("Pandora");
    citiesGraph.addVertex("Arendelle");
    citiesGraph.addVertex("Metroville");
    citiesGraph.addVertex("Monstroplolis");
    citiesGraph.addVertex("Narnia");
    citiesGraph.addVertex("Naboo");
    citiesGraph.addEdge("Pandora","Arendelle",150);
    citiesGraph.addEdge("Arendelle","Metroville",99);
    citiesGraph.addEdge("Arendelle","Monstroplolis",42);
    citiesGraph.addEdge("Metroville","Narnia", 37);
    citiesGraph.addEdge("Metroville","Pandora", 82);
    citiesGraph.addEdge("Metroville","Naboo", 26);
    citiesGraph.addEdge("Monstroplolis","Metroville", 105);
    citiesGraph.addEdge("Monstroplolis","Naboo", 73);
    citiesGraph.addEdge("Naboo","Narnia", 250);



    App app = new App();

    List<String> travelDestination = new ArrayList<>();
        travelDestination.add("Pandora");
    travelDestination.add("Arendelle");

    System.out.println(app.businessTripCost(citiesGraph, travelDestination));


        List<String> citiesArr2 = new ArrayList<>();
        citiesArr2.add("Arendelle");
        citiesArr2.add("Monstroplolis");
        citiesArr2.add("Naboo");

        System.out.println(app.businessTripCost(citiesGraph, citiesArr2));

        List<String> citiesArr3 = new ArrayList<>();
        citiesArr3.add("Naboo");
        citiesArr3.add("Pandora");

        System.out.println(app.businessTripCost(citiesGraph, citiesArr3));

    }


    public Integer businessTripCost(GraphClass graph, List<String> cities){
        totalCost = 0;
//        int citiesSize = cities.size();

        for (int i = 0; i < cities.size(); i ++){
            if (i + 1 >= cities.size()){
                break;
            }
            helperTrip(cities.get(i), cities.get(i + 1), graph);
        }

        return totalCost == 0 ? 0 : totalCost;
    }

    private void helperTrip(String city1, String city2, GraphClass graph){
        if (graph.getNeighbors(city1) == null){
            return;
        }
        for (Vertex vertex: graph.getNeighbors(city1)) {
            if (city2.equals(vertex.label)){
                totalCost += vertex.weight;
                break;
            }
        }
    }
}
