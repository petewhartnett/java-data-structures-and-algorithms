package tree;

public class Node2 {

   public Node2 right;
   public Node2 left;
   public String data;

    public Node2(String data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void data(){
        System.out.println("data " + data);
    }
}
