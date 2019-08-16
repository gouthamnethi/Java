import java.util.*;
public class Array1{
public static void main(String args[]){
int n,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
n=sc.nextInt();
int a[]=new int[n];
int b[] = new int[n];

System.out.println("Enter the array 1 Elements :");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the array 2 elements :");
for(i=0;i<n;i++){
b[i]=sc.nextInt();
}
int c[] = new int[n];
//Sum is
for(i=0;i<n;i++){
c[i]=a[i]+b[i];
}
System.out.println("Sum is :");
for(i=0;i<n;i++){
System.out.println(c[i]);
}
}
}