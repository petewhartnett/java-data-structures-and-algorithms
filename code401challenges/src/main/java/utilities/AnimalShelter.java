package utilities;


import stacksandqueues.Node;

public class AnimalShelter {

    Dog back;
    Cat back1;

    public void enqueue(String name){
        Dog dog = new Dog(name);

        if(back == null){
            back = dog;
            System.out.println("It was empty");
        }
        else {
            dog.next = back;
            back = dog;
            System.out.println("It was not Empty" );
        }
    }
    public void enqueueCat(String name){
        Cat cat = new Cat(name);

        if(back1 == null){
            back1 = cat;
            System.out.println("It was empty");
        }
        else {
            cat.next = back1;
            back1 = cat;
            System.out.println("It was not Empty" );
        }
    }


    public String dequeue()
    {
        String n;
        Dog current = back;
        if(back == null){
            return null;
        }
        else{
            while(current.next.next != null){

                current = current.next;

            }
            n = current.next.name;
            current.next = null;

        }


        return n;
    }

    public String dequeueCat()
    {
        String n;
        Cat current = back1;
        if(back1 == null){
            return null;
        }
        else{
            while(current.next.next != null){

                current = current.next;

            }
            n = current.next.name;
            current.next = null;

        }


        return n;
    }

    public String toString(){

        Dog current = back;
        String str = "";
        while(current.next != null){

            current = current.next;
        }

        str += "{";
        str += current.name;
        str += "}";

        return str;
    }


}
