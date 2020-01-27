package tree;

import java.util.ArrayList;

public class Tree {

    Node root;
    public Tree(){

        root = null;

    }
    // baeldung.com and a geeks for geeks whiteboard style video were referenced during research for this tree
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

        ArrayList<Integer>inOrder(Node node){

        if (node == null){
            return arrayList;
        }

        inOrder(node.left);
        arrayList.add(node.data);
        inOrder(node.right);

          return arrayList;

        }

    ArrayList<Integer>preOrder(Node node){

        if (node == null){
            return arrayList;
        }

        arrayList.add(node.data);
        inOrder(node.left);
        inOrder(node.right);



        return arrayList;

    }

    ArrayList<Integer>postOrder(Node node){

        if (node == null){
            return arrayList;
        }

        inOrder(node.left);
        inOrder(node.right);
        arrayList.add(node.data);

        return arrayList;

    }

}
