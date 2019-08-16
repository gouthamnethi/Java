import java.util.*;
public class strings{
public static void main(String args[])
{
String str1,str2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the First Name:");
str1=sc.next();
System.out.println("Enter the Second name: ");
str2=sc.next();
System.out.println("Contatenating string2 into string1");
str1=str1.concat(str2);
System.out.println(str1);
}
}