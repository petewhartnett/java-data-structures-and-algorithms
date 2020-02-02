package tree;

import stacksandqueues.Queue;

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

    public ArrayList<Integer> breadthSearch(Node node){

        Queue queue = new Queue();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        queue.enqueue(node.data);

        while(!queue.isEmpty()){

            if(node.left != null){

                queue.enqueue(node.data);
                arrayList.add(queue.dequeue());
            }
            if(node.right != null){
                arrayList.add(queue.dequeue());
                queue.enqueue(node.data);
            }

        }

        return arrayList;

    }
    int maxValue = Integer.MIN_VALUE;

    public int findMaxValue(Node node, int maxValue){

        if (node == null){
            return maxValue;
        }
        if(node.data > maxValue){
            maxValue = node.data;
        }
        findMaxValue(node.left, maxValue);
        findMaxValue(node.right, maxValue);

        return maxValue;

    }


}
