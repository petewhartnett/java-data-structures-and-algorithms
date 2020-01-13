package linkedlist;

public class Node
{

    Node next;
    int data;
    public Node(int data){
        this.data = data;

    }

    public void display(){
        System.out.println("data " + data);
    }
}
