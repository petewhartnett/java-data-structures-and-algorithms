package graph;

import org.junit.Test;
import tree.Node;
import treeIntersection.TreeIntersection;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class GraphTest {


    @Test
    public void GraphEdgeTest() {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);
        graph.addEdge(3,5);
        graph.addEdge(7,1);
        graph.addEdge(2,4);
        graph.addEdge(2,2);

        List<String> list = graph.getNeighbors();

        String actual = list.get(2);
        String expected = "Location 2 neighbors with 2 ";

        assertEquals("Checks neighbors for graph ", expected, actual );

    }

    @Test
    public void GraphEdgeTest2() {
        Graph graph = new Graph(8);
        graph.addEdge(1,6);
        graph.addEdge(4,1);
        graph.addEdge(7,1);
        graph.addEdge(3,3);
        graph.addEdge(2,1);

        List<String> list = graph.getNeighbors();

        String actual = list.get(1);
        String expected = "Location 1 neighbors with 7 ";

        assertEquals("Checks neighbors for graph ", expected, actual );

    }

    @Test
    public void GraphSizeTest() {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(1,7);


        graph.getGraphSize();
        int actual = graph.getGraphSize();
        int expected = 30;
        assertEquals("Tests the graph size ", expected, actual );

    }


    @Test
    public void GraphSizeTest2() {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(1,7);
        graph.addEdge(1,8);
        graph.addEdge(1,9);
        graph.addEdge(3,4);
        graph.addEdge(6,5);
        graph.addEdge(4,7);



        graph.getGraphSize();
        int actual = graph.getGraphSize();
        int expected = 64;
        assertEquals("Tests the graph size ", expected, actual );

    }

    @Test
    public void GraphAddNodeTest() {
        Graph graph = new Graph(6);


        int actual = graph.addNode(3); ;
        int expected = 3;
        assertEquals("Tests the add node feature ", expected, actual );

    }

    @Test
    public void GraphAddNodeTest2() {
        Graph graph = new Graph(6);


        int actual = graph.addNode(5); ;
        int expected = 5;
//        System.out.println(actual);
        assertEquals("Tests the add node feature ", expected, actual );

    }

    @Test
    public void emptyTest() {
        Graph graph = new Graph(1);

      List<String> actual = graph.printOutAll();

        List<String> expected = new ArrayList<>();



        assertEquals("If empty array list sends out a null value, same as the null default of a new empty array list", expected, actual );

        // }
    }

    @Test
    public void GraphPrintTest() {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);



        List<String> list = graph.printOutAll();

        String actual = list.get(0);
        String expected = "Location 1 connects with 2 ";



       assertEquals("checks the printing values stored in array list", expected, actual );

        // }
    }


    @Test
    public void GraphNeighborsTest() {
        Graph graph = new Graph(8);
        graph.addEdge(1,2);
        graph.addEdge(3,5);
        graph.addEdge(7,1);
        graph.addEdge(2,4);
        graph.addEdge(2,2);


        BFS bfs = new BFS();


        List<String> list = graph.getNeighbors();

        String actual = list.get(2);
        String expected = "Location 2 neighbors with 2 ";

        assertEquals("Checks neighbors for graph ", expected, actual );

    }




    @Test
    public void GraphPrintTest2() {
        Graph graph = new Graph(8);
        graph.addEdge(3,4);

        List<String> list = graph.getNeighbors();

        String actual = list.get(0);
        String expected = "Location 3 neighbors with 4 ";

        assertEquals("Test Print Out", expected, actual );

        // }
    }
}