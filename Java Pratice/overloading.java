import java.util.*;
public class overloading{
public static void main(String args[]){
int diameter;
String color;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the diameter:");
diameter=sc.nextInt();
System.out.println("Enter the Color:");
color = sc.next();
draw();
draw(diameter);
draw(diameter,color);
}
public static void draw(){
System.out.println("Drawing circle with default color Black and diameter 1cm");
}
public static void draw(int diameter){
System.out.println("Drawing circle with default color Black and diameter "+diameter+" cm");}
public static void draw(int diameter, String color){
System.out.println("Drawing circle with default color "+color+" and diameter "+diameter+" cm");}
}