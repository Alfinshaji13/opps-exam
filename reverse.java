import java.io.*;
import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a;
int c=0;
int b;
a=sc.nextInt();
for(int i=0;i<3;i++)
{
b=a%10;
c=c*10+b;
a=a/10;
}
System.out.println("the reversed number:"+c);
}
}
