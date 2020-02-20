package tree;


    public class Node
    {
        public Node right;
       public  Node left;
        public int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void data(){
            System.out.println("data " + data);
        }
    }



