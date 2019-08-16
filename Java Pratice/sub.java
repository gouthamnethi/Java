import java.util.*;
import java.io.*;
import java.lang.*;
class b
{
public static void main(String args[])
{
float a,b,c,d;
double sub;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value a:");
a=sc.nextFloat();
System.out.println("Enter the value of b:");
b=sc.nextFloat();
c=(a-b)*(a/b);
d=(a+b)*(a*b);
sub=(c/d);
System.out.println("Sub is: "+sub);
}
}