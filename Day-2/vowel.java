import java.util.Scanner;
Class Vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Char ch;
System.out.println("Enter a letter:");
Ch=sc.next();
if(Ch='a'|| Ch='e'|| Ch='i'|| Ch='o'|| Ch='u')
{
System.out.println("the given letter is vowel");
}
else
{
System.out.println("the given letter is constant");
}
}
}