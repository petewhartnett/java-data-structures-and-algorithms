package tree;


    public class Node
    {
        Node right;
        Node left;
        int data;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void data(){
            System.out.println("data " + data);
        }
    }



