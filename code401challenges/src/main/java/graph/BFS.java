package graph;

import linkedlist.LinkedList;
import stacksandqueues.Queue;

public class BFS {


    void bfs(int source) {

        boolean nodesVisited[] = new boolean[0];

        Queue queue = new Queue();

        queue.enqueue(source);

        while(queue != null){

        source = queue.dequeue();
        System.out.println(source);
     //  queue.enqueue(source)


        }

    }


}
