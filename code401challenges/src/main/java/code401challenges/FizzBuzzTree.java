package code401challenges;


import tree.Node;
import tree.Node2;
import tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree<e> {


    Tree tree = new Tree();

    ArrayList arrayList = new ArrayList();

    ArrayList<e> fizzBuzz(Node node){

        if (node == null){
            return arrayList;
        }



        fizzBuzz(node.left);
         if(node.data % 3 == 0 && node.data % 5 == 0){

            arrayList.add("fizzBuzz");
        }
        else if(node.data % 3 == 0){

            arrayList.add("fizz");
        }
        else if(node.data % 5 == 0){

            arrayList.add("buzz");
        }


        else{
            arrayList.add(node.data);
        }
        fizzBuzz(node.right);

        return arrayList;

    }


}
