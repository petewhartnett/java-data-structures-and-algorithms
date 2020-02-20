package treeIntersection;

import tree.Node;
import tree.Tree;


import java.util.ArrayList;

public class TreeIntersection {
// Reference for retainALL() Method - https://www.javatpoint.com/java-arraylist-retainall-method

  //  private static ArrayList<Integer> arrayList;

    public static ArrayList<Integer> treeIntersection(Node tree, Node tree2){

        ArrayList<Integer> finalArrayList = new ArrayList<Integer>();
        Tree test = new Tree();
        ArrayList<Integer> arrayList = test.inOrder(tree);
        ArrayList<Integer> arrayList2 = test.inOrder(tree2);
//        System.out.println(arrayList.toString());
//        System.out.println(arrayList2.toString());

      arrayList.retainAll(arrayList2);


       System.out.println(arrayList.toString());

    return arrayList;

}



}
