import java.util.*;
import java.lang.Math.*;
public class power1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n,p,res;
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("Enter the power:");
p=sc.nextInt();
res = (int)Math.pow(n,p);
System.out.println("Power of the given number "+n+" of power "+p+" is "+res);
}
}