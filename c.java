class A
{
void name()
{
System.out.println("hey");
}
void display()
{
System.out.println("hi");
}
}
class B extends A
{
void name()
{
System.out.println("hello");
}
}
class C
{
public static void main(String args[])
{
B ob=new B();
A ob1=new A();
ob.display();
ob1.name();
ob.name();
}
}
 