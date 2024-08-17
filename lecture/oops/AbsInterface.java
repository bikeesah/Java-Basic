/*
 1.All  the fields in interface are public ,static,and final by default.
 2.All method are public and abstract by default 
 3.A class that implements an interaface must implement all  the methods declared in the interface
 4.Interface support the functionality of multimple inheritance
 */


interface Animal{
    int eyes=2;
    void walk(); //we can write  public it is by default interface
}

interface Hebivorese{
     
     static void eats(){
      System.out.println("Eats Grass");
    }
}

class Horse implements Animal,Hebivorese{
    public void walk(){
        System.out.println("Walk on four legs");

    }
}


public class AbsInterface {
    public static void main(String[] args) {
    Horse horse1=new Horse();
    horse1.walk();
    //accesing static 
    
    Hebivorese.eats();
    }
    
}
