import java.io.*;
import java.util.*;
public class WriteDate{
Date D= new Date();
try{
FileOutputStream f= new FileOutputStream("C:\Users\Training\Desktop\date.txt");
ObjectOutputStream s= new ObjectOutputStream(f);
s.writeObject(d);
s.close();

}
catch (IOException e){e.printStackTrace();}
public static void main (String []args){
new WriteDate();
}
}