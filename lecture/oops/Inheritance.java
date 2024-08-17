
/*
 Inherite the property from one class to another class
  Parent class - Base class 
  child class -sub class

  There are 5 types of Inheritance is java and 4 in C++
  1.Single level Inheritance
  2.Multi-level Inheritance
  3.Multiple level Inheritance  C++
  4.Hieraricheal level Inheritance 
  5.Hybrid  Inheritance
*/ 
 
    //single level inheritance 
    /*
     
class  Shape{
    String color;
    public void area(){
System.out.println("Area is displayed ");
}

class Triangle extends Shape{
    
public void area(int base,int height){
          float area=1/2*(base*height);

          System.out.println(area);
    }



 */
class  Shape{
    String color;
    public void area(){
        System.out.println(" AREA IS Displayed");
    }
}

class Triangle extends Shape{
    public void area(int base,int height){
          float area=1/2*(base*height);

          System.out.println(area);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="black";


    }
}
