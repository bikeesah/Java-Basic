/*
 * Polymorphism many forms 
 * Two types of polymorphisms
 * 1.Function overloading = Compile time 
  There must be differntiating factor eigther return type should be different
  There should be different types of parameters inside it 
  
  Creating different function of same name but different dataype 
 * 2.Function overriding   = Run time =inheritance 
 */
class Student{
    String name;
    int age;
    // calling overloading function
    public void Info(String name){
        System.out.println(name);

    }

    public void Info(int age){
        System.out.println(age);

    }

    public void Info(String name, int age){
        System.out.println(name +" "+age);

    }
}
public class Polymorphism {
    public static void main(String[] args) {
     Student s1=new Student();  
     s1.name="Bikee";
     s1.age=22;

    s1.Info(s1.name,s1.age);

    }
    
}
