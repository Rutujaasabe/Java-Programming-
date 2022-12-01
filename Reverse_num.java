import java.util.Scanner;
class Reverse_num
{
   public static void main(String ru[])
{
     int rem ,rev=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int num=sc.nextInt();
         
            for( ;num!=0;)
{
         rem = num%10;
         rev =rev*10+rem;
         num=num/10;
         
}
      System.out.println("reverse number of given number is = " +rev);    
}

}