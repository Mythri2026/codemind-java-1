import java.util.*;
public class First{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int s=(n1*n1)+(n2*n2);
        System.out.printf("%.2f",Math.sqrt(s));
    }
}