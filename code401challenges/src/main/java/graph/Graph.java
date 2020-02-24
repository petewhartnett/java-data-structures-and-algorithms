package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {


     //references -
     //https://www.baeldung.com/java-graphs
    // https://algorithms.tutorialhorizon.com/graph-representation-adjacency-matrix-and-adjacency-list/

    int size;
    LinkedList<Integer> graphList[];


    public Graph(int size){

        this.size = size;
        graphList = new LinkedList[size];


        for(int i = 0; i < size; i++ ){

            graphList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int originalLocation, int destination){
        //addfirst adds to the beginning of the linked list
        graphList[originalLocation].addFirst(destination);

        // This will add the back edge
        graphList[destination].addFirst(originalLocation);

    }

    public int addNode(int node){
        for(int i = 0; i < node; i++ ){

            if(graphList[i] == null){
                graphList[i].addFirst(node);
            };
        }
        return node;
    }


    public List<String> getNeighbors() {
        List<String>  list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (graphList[i].size() > 0) {

                for (int j = 0; j < graphList[i].size(); j++) {
                    list.add("Location " + i + " neighbors with " + graphList[i].get(j) + " ");

                }
            }
        }
        return list;
    }


    public List<String> printOutAll() {
        List<String>  list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (graphList[i].size() > 0) {

                for (int j = 0; j < graphList[i].size(); j++) {
                  list.add("Location " + i + " connects with " + graphList[i].get(j) + " ");

                }
            }
        }
            return list;
    }

        public int getGraphSize(){
            int count = 0;
            for(int i = 0; i < size; i++){
                if(graphList[i].size() > 0) {
                    for (int j = 0; j < graphList[i].size(); j++) {
                        count += graphList[i].size();
                        System.out.println(graphList[i].get(j) + " ");
                    }
                }
            }

            System.out.println(count);
            return count;
        }

    }





