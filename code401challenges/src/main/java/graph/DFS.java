package graph;


import java.util.Iterator;

//depth first search method using recursion similiar to the dfs of a binary tree

//references - https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
// - https://www.tutorialspoint.com/data_structures_algorithms/depth_first_traversal.htm

public class DFS {


    public void dfsCallBack(int vectorSource, boolean nodesVisited[]){

        Graph graph = new Graph(5);

        nodesVisited[vectorSource] = true;

        Iterator<Integer> iterate = graph.graphList[vectorSource].listIterator();

        while(iterate.hasNext())
        {

            int k = iterate.next();
            //if the node has not been visited and is labeled true then recursion is used to continue
            if(!nodesVisited[k])
                dfsCallBack(k, nodesVisited);

        }

    }

    void mainDFS (int vectorSource){


        boolean nodesVisited[] = new boolean[vectorSource];

        dfsCallBack(vectorSource, nodesVisited);



    }




}
