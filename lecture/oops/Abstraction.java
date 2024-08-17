/*
 Process of hidding the irrevelant data. 
 showing only the require information. 
 Hiding the important and unsafe data.
 */
/**
 * InnerAbstraction
 */
abstract class Animal{  //It is irrevalant that it is of no use . it is a blue print it cannot be used  
    abstract void walk();

    public void eats(){
        System.out.println("Animal eats Grass");
    }


}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on fourlegs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on Twolegs " );
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1Horse=new Horse();
        h1Horse.walk();
        h1Horse.eats();
       
        
    }
    
}
