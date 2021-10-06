import java.io.*;
import java.util.Scanner;
class product
{
int code;
String name;
int price;
read();
{
System.out.println("enter the product code,product name,product price:");
Scanner ch=new Scanner(System.in);
code=ch.nextInt();
name=ch.next();
price=ch.nextInt();
}
show();
{
System.out.println("product code"+code);
System.out.println("product name"+name);
System.out.println("product price"+price);
}
class product1
public static void main(String args[])
{
int n;
System.out.println("enter the number of product");
Scanner ch=new Scanner(System.in);
n=ch.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
{
ar[i]=read();
}
for(int i=0;i<n;i++)
{
int ch=min(price.a[i]);
show(ch);
}
}
}
















