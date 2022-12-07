import java.util.*;
class Prime_num
{
  public static void main(String ruts[])
 {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number from user : ");
     int num = sc.nextInt();
     int count =0;
      
     if(num<=1)
        System.out.println(num +" is not prime number");
    else
          for(int i=2;i<=num; i++)
{
          if(num%i==0)
        {
             count++ ;
            
           }
       
}  
       if ( count >2) 
    
        System.out.println(+num+" is not prime number");
     
       else
              System.out.println(+num+" is prime number");
   
       
        
   
  }
}