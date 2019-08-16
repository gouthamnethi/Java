import java.util.*;
public class power1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n,p,res;
System.out.println("Enter the number:");
n=sc.nextInt();
System.out.println("Enter the power:");
p=sc.nextInt();
res = Math.power(n,p);
System.out.println("Power of the given number "+n+" of power "+" is "+res);
}
}