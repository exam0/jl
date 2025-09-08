import java.util.*;
public class SortingNames
{
public static void main(String args[])
{
String names[];
 try
{
Scanner s = new Scanner (System.in);
System.out.println("Enter the number of names : ");
int n = s.nextInt();
 names = new String[n];
System.out.println("Enter the names one by one..");
 for(int i=0;i<n;i++)
names[i] = s.next();
System.out.println("Names in alphabetical order");
 for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
 if(names[i].compareTo(names[j])>0)
 {
String t = names[i];
names[i] = names[j];
names[j] = t;
}
 System.out.println(names[i]);
 }
}
catch(Exception e)
{e.printStackTrace();}
 }
}