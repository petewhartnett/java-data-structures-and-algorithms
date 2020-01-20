package stacksandqueues;



public class Stack {

    Node top;

    public void push(int data){
        stacksandqueues.Node node = new Node(data);

        if(top == null){
            top = node;
            node.next = null;
            System.out.println("It was empty");
        }
        else {
            node.next = top;
            top = node;
            System.out.println("It was not Empty" );
        }
    }

    int n = 0;
    public Integer pop(){
       n =  top.data;
        top = top.next;

        return n;

    }

    public Integer peek(){
        n =  top.data;

        return n;

    }

    public boolean isEmpty(){
        boolean isTrue = true;

        if(top != null){
            isTrue = false;

        }

return isTrue;
    }


    public String toString(){

        String str = "";

            str += "{";
            str += top.data;
            str += "}";

        return str;
    }


}
