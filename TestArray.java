public class TestArray {
    public static void main(String[] args) 
    {
        int[] ram= {2,5,6,9,7,8};
        int sum=0;
        
        for (int i=0; i<ram.length;i++) 
        {
            
         System.out.println("ram [ "+ram[i] +"]");// Printing array
         //sum of array elements
            sum+=ram[i];
        }
        System.out.println("The sum is:"+sum);
        
        //Finding average
        int max =ram[0];
        for (int i=1; i<ram.length;i++) 
        {
            if(ram[i]>max)
            {
                max=ram[i];
            }
        }      
        System.out.println("Max is :" +max);

        //Finding minimum
        int min =ram[0];
        for (int i=1; i<ram.length;i++) 
        {
            if(ram[i]<min)
            {
                min=ram[i];
            }
        }      
        System.out.print("Min is :" +min);
    }
}
