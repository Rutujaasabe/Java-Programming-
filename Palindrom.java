import java.util.*;

class Pallindrom {
  public static void main(String ruts[]) {
    int  palli = 0, rem = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Entert he number");
    int num = sc.nextInt();
    
    int temp = num;
    for (int i=0; i <= num;i++);
    {
      rem = num % 10;
      palli = palli * 10 + rem;// palli =1 ---->num =num/10=12--->
                               // rem=1-->rem=2>pall=1*10+2=12------------>num=num\10=1; 1/10=1;
      // 12*10 +1=121
      num = num / 10;

    }
    if (palli == temp) {
      System.out.println(" pallindrome");
    } else

      System.out.println(" not pallindrome");
  }
}