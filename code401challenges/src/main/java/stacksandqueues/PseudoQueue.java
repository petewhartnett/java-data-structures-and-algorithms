package stacksandqueues;

public class PseudoQueue {
    Node front;
    public void enqueue(int data){

        stacksandqueues.Node node = new Node(data);
        node.data = data;
        if(front == null){
            front = node;
            node.next = null;
            System.out.println("It was empty");
        }
        else {
            node.next = front;
            front = node;
            System.out.println("It was not Empty" );
        }

    }


    public int deEnqueue(int data){

        stacksandqueues.Node node = new Node(data);
        node.data = data;
        int n = 0;
        Node current = front;
        if(front == null){
            return 0;
        }
        else{
            while(current.next.next != null){

                current = current.next;

            }
            n = current.next.data;
            current.next = null;

        }


        return n;

    }



    public String toString(){

        String str = "";

        str += "{";
        str += front.data;
        str += "}";

        return str;
    }


}
