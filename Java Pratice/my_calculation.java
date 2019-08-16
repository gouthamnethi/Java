import java.util.*;
public class my_calculation extends calculation{
public static void main(String args[]){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a :");
a=sc.nextInt();
System.out.println("Enter the value of b :");
b=sc.nextInt();
my_calculation demo = new my_calculation();
demo.addition(a,b);
demo.subtraction(a,b);
demo.multiplication(a,b);
}
}
