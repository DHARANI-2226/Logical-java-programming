import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter the value of a:");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}
}