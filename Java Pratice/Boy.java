class Boy extends Human_Overriding{
public void eat(){
System.out.println("Boy is eating");
}
public static void main(String args[]){
Boy obj = new Boy();
obj.eat();
}
}