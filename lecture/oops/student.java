
public class student {
    String name;
    int age;
    public void printInfo(){ // calling a function
        System.out.println(this.name);
        System.out.println(this.age);
    }
  //calling a constructor having same name as class parametized constructor 
     student( String name,int age){
         this.name=name;
         this.age=age;
         System.out.println("calling constructor");

        //2. Non -parametrized constructor


    //  student( ){
    //        System.out.println("calling constructor");





    //3.copy constructor 
    // student( student s3){
    //         this.name=s2.name;
    //          this.age=s2.age;
        //     System.out.println("calling constructor");

    }
    public static void main(String[] args) {
     // callling constructor in the object is declare   
      student s1=new student("Rabindra",21);
    // s1.name="Bikee sah";
    // s1.age=22;

     student s2=new student("Bikee",22);
    // s2.name="Rabindra";
    // s2.age=21;
    
    //student s3=new student("Abhay",23);

    
    s1.printInfo();
    s2.printInfo();
        
    }
}

//constructors are the special type of methods which has same name as class 
// it does not return any thing it does not have return type ,it can be called once for a objecet
// type of constructor:-  non parametrized ,parametrized like(int, age, string name) , copy constructor
// 

