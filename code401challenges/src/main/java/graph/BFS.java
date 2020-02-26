package graph;

import linkedlist.LinkedList;
import stacksandqueues.Queue;

import java.util.Iterator;



//References - https://www.baeldung.com/java-graphs
// - https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/


public class BFS {

    Graph graph = new Graph(5);

    void bfs(int source) {

        boolean nodesVisited[] = new boolean[0];

        Queue queue = new Queue();

        nodesVisited[source] = true;
        queue.enqueue(source);

        while(queue != null){

        source = queue.dequeue();
        System.out.println(source);
     //  queue.enqueue(source)

            Iterator<Integer> iterate = graph.graphList[source].listIterator();

            while(iterate.hasNext())
            {
                int j = iterate.next();
                if(!nodesVisited[j]){

                    nodesVisited[j] = true;
                    queue.enqueue(j);
                }

            }


        }

    }


}
