
class Account{
     public String name;
     protected String gmail;
     private int password;

     //getter and setter 
     public int  getPassword(){
        return this.password;
     }
     public void setPassword(int pass){
        this.password=1235;
     }
    

}

public class Bank {
    public static void main(String[] args) {
    Account account1=new Account();
    account1.name="Bikee";
    account1.gmail="sahkumarbikee123@gmail.com";
    account1.setPassword(12345);

    System.out.println(account1.getPassword());

    }
    
}
