package linkedlist;
// Geeks for Geeks, Stackoverflow, and linkedlist in java video series were all referenced for this lab.

public class LinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            node.next = null;
            System.out.println("It was empty");
        }
        else {
            node.next = head;
            head = node;
            System.out.println("It was not Empty" );
            }
         }


         public boolean searchNode(Node head, int n){
          Node current = head;
            while(current != null){
               if( current.data == n){
                   return true;
               }
               else {

                   current = current.next;
               }
               }
             return false;
            }


    public String toString(Node head){
        Node current = head;
        String str = "";
        while(current != null){
            str += "{";
            str += current.data;
            str += "} -> ";
          // System.out.println(current.data);
                current = current.next;
            }
        return str;
    }


    }









