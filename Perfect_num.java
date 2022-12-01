import java . util. Scanner;
 class Perfect_num
 {
         public static void main(String rutu[])
   {
         int n,i;
       
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
       n = sc.nextInt();
       int sum = 0;
       
 for(i = 1 ; i< n; i++)
 {
    if(n % i ==0)
 {
     sum = sum+ i ;
  }
   }

  if(sum == n)

         System.out.println(n+ "  = perfect number\n");
  else

         System.out.println(n+ "  = not a perfect number\n");

System.out.println();
   }
}