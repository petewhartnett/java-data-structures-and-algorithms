package code401challenges;


import tree.Node2;
import tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree {


    Tree tree = new Tree();

    ArrayList<String> arrayList = new ArrayList<String>();

    ArrayList<String>fizzBuzz(Node2 node){

        if (node == null){
            return arrayList;
        }



        fizzBuzz(node.left);
        if(node.data == "3"){
            node.data = "fizz";
            arrayList.add(node.data);
        }
        else if(node.data == "5"){
            node.data = "buzz";
            arrayList.add(node.data);
        }

        else if(node.data == "15"){
            node.data = "fizzBuzz";
            arrayList.add(node.data);
        }
        else{
            arrayList.add(node.data);
        }
        fizzBuzz(node.right);

        return arrayList;

    }


}
