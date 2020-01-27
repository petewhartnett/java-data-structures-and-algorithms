package tree;

public class BinarySearchTree {



    Node root;

    //baeldung.com was referenced for this method
    public  Node insertData(Node node, int data){

        //base case for recursion
        if(node == null){
            return new Node(data);
        }
        else if(data > node.data){
            node.right = insertData(node.right, data );
        }
        else if (data < node.data){
            node.left = insertData(node.left, data);
        }
            return node;
    }

    //baeldung.com was referenced for this method
    public void callInsertData(int data){

        root = insertData(root, data);
        System.out.print(data);
    }

    public boolean searchForDataRecursion(Node node, int data) {
       //First base case
        if (node == null) {
            return false;
        }
        // checks if data is at current node
        if (data == node.data) {
            return true;
        }
        //if not then runs recursion to the left
        else if (data < node.data) {
           return  searchForDataRecursion(node.left, data);

        }
        //once done with left it will go right
        else {
           return  searchForDataRecursion(node.right, data);
        }

    }

    public boolean callsSearchForData( int data){
      return  searchForDataRecursion(root, data);
    }
    }



