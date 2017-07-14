package abc;
public class Package
{
public int=20;
}

package xyz;
class Import
{
public int 20;
}


import abc;
import xyz;
class Third
{
public static void main(String args[])
{
package ob=new Package();
Import o=new Import();
System.out.println(ob.i);
System.out.println(o.i);
}
}

