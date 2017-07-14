class first
{
int i=10;
int j=5;
int k=8;
}
class second extends first
{
int l=6;
int m=3;
int n=9;

void put1()
{
System.out.println(l);
System.out.println(m);
System.out.println(n);
System.out.println(super.i);
System.out.println(super.j);
System.out.println(super.k);
}
}
class third
{
public static void main(String args[])
{
second s=new second();
s.put1();
}
}

 