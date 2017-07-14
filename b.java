class A
{
void name(int a)
{
System.out.println(a);
}
void name(int x,long y,double z)
{
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
void name(int l,float m,char n,long o)
{
System.out.println(l);
System.out.println(m);
System.out.println(n);
System.out.println(o);
}
}
class B
{
public static void main(String args[])
{
A obj=new A();
obj.name(8);
obj.name(5,101,1.5);
obj.name(9);
obj.name(9,2.3f,'a',61);
}
}