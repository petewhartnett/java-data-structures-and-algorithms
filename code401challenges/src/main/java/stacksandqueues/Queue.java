package stacksandqueues;

public class Queue {

    Node back;
    Node front;


    public void enqueue(int data){
        stacksandqueues.Node node = new Node(data);

        if(back == null){
            back = node;
            System.out.println("It was empty");
        }
        else {
            node.next = back;
            back = node;
            System.out.println("It was not Empty" );
        }
    }

    public int dequeue()
    {
        int n = 0;
        Node current = back;
        if(back == null){
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


public int peek(){

        Node current = back;

        while(current.next != null ){
            current = current.next;
        }

        return current.data;
}


    public boolean isEmpty(){
        boolean isTrue = true;

        if(back != null){
            isTrue = false;

        }

        return isTrue;
    }


    public String toString(){

        Node current = back;
        String str = "";
while(current.next != null){

    current = current.next;
}

        str += "{";
        str += current.data;
        str += "}";

        return str;
    }


}
