package utilities;

public class Cat {

    String name;
    Cat next;

    public Cat(String name){
        this.name = name;

    }

    public void display(){
        System.out.println("name " + name);
    }

}
