 import java.util.Scanner;
 public class Choose implemets interface Area{
public static void main(string []args){
System.out.println("Choose the option: 1- Circle\n 2- Rectangle\n 3- Square");
Scanner d = new Scanner(system.in);
int j= d.nextLine();
Choose q =new Choose();

switch(j){
case 1 : q.Cicle();
break;
case 2 : q.Rectangle();
break;
case 3 : q.Square();
break;
default: System.out.println("choose wisely");

} 
}}
