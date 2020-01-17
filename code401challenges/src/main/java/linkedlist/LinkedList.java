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

            public void append(int data){
            Node appendData = new Node(data);
            if(head == null){
                head = appendData;
                return;
            }
            appendData.next = null;

            Node current = head;
            while(current.next != null){
                current = current.next;
            }

            current.next = appendData;
            return;

            }


            public void insertAfter(Node prev, int data){

            Node insertAfter = new Node(data);

            insertAfter.next = prev.next;

            prev.next = insertAfter;


            }

            public void insertBefore(Node prev, int data){

             Node insertBefore = new Node(data);

             Node current = head;
                while (current.next != null){
             if(current.next == prev){
                current.next = insertBefore;
                insertBefore.next = prev;
                break;

                }

            current = current.next;
            }


    }

    public int findKth(Node head, int k){

        Node current = head;

        while (k > 0){
            current = current.next;
            k--;
        }
        Node getKth = head;
        while(current != null){
            current = current.next;
            getKth = getKth.next;

        }
        int j = getKth.data;

        return j;
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

    public void mergeList(Node one, Node two) {

        if (one == null || two == null) {
            return;
        }

        Node runner = one.next;
        one.next = two;
        mergeList(two, runner);
    }


    }









