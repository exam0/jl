1.

import java.util.Scanner;
 class Student
{
int rollno, mark1, mark2, mark3, total;
String name, result;
float average;
void SetDetails(int r, String name, int m1, int m2, int m3)
{
rollno = r;
this.name = name;
 mark1 = m1;
 mark2 = m2;
 mark3 = m3;
}
void processDetails()
{
if(mark1>=50&&mark2>=50&&mark3>=50) result = "pass";
else
result = "fail";
total = mark1+mark2+mark3; average = total/3.0f;
}
void displayDetails()
{
System.out.println("\t Student Report");
System.out.println("Roll No : "+rollno); System.out.println("Student name : "+name);
System.out.println("Mark1 : "+mark1); System.out.println("Mark2 : "+mark2);
System.out.println("Mark3 : "+mark3); System.out.println("Total : "+total);
System.out.println("Average : "+average); System.out.println("Result : "+result);
}
}
class StudentReport
{
public static void main(String args[])
{
int roll, m1, m2, m3; String name;
Student s = new Student();
Scanner m = new Scanner(System.in);
System.out.println("Enter rollno : ");
roll = m.nextInt();
System.out.println("Enter your name : ");
name = m.next();
System.out.println("Enter your mark1 : ");
m1 = m.nextInt();
System.out.println("Enter your mark2 : ");
 m2 = m.nextInt();
System.out.println("Enter your mark3 : ");
m3 = m.nextInt();
s.SetDetails(roll, name, m1, m2, m3);
 s.processDetails();
s.displayDetails();
}
}


2

import java.util.Scanner;
class Rectangle
{
double length, breadth; Rectangle(double l, double b)
{
length = l; breadth = b;
}
double area()
{
return(length*breadth);
}
}
class Rectangle1 extends Rectangle
{
Rectangle1(double l, double b)
{
super(l,b);
}
void perimeter()
{
System.out.println("\n Perimeter of the Rectangle : "+2*(length+breadth));
}
}
class SingleInheritance
{
public static void main(String args[])
{
double l, b, area;
Scanner s = new Scanner(System.in);
 System.out.println("\n Enter your value of length and breadth");
 l = s.nextInt(); b = s.nextInt();
Rectangle1 obj1 = new Rectangle1(l,b); area = obj1.area();
 System.out.println("\n Area of the Rectangle : "+area);
 obj1.perimeter();
}
}

3.

import java.util.Scanner;
abstract class Department
{
protected String empname;
protected double empsalary;
 Department(String name, double salary)
{ empname = name;
 empsalary = salary; }
void distotalsalary()
{
System.out.println("\n Employee name : "+empname);
System.out.println("\n Employee salary : "+empsalary);
}
abstract void calcBonus();
}
class Account extends Department
{
double hra, tax, bonus;
 Account(String name, double salary)
{
 super(name, salary);
 hra = empsalary * 0.20;
tax = empsalary * 0.05; bonus = 0.0;
}
void calcBonus()
{
 if(empsalary> 20000)
bonus = empsalary * 0.10;
else
bonus = empsalary * 0.20;
}
void disTotalsalary()
{
 super.distotalsalary();
 calcBonus();
 System.out.println("\n Total salary : " +((empsalary + hra + bonus)-tax))
 }
}
class AbstractClass
{
public static void main(String args[])
{
String name;
double basic;
Scanner s = new Scanner(System.in);
System.out.println("\n Enter the name ");
name = s.next();
System.out.println("\n Enter basic salary");
 basic = s.nextDouble();
Account obj1 = new Account(name, basic);
obj1.disTotalsalary();
 }
}


4

import java.util.*;
class MultipleException
{
 public static void main(String args[])
 {
 Scanner s = new Scanner(System.in);
 try
 {
 System.out.print("Enter a number :");
 int a = s.nextInt();
 int b = 12/a;
 int c[] = new int[b];
 c[4] = 10;
 System.out.println("Array Created");
 }
 catch(ArithmeticException e)
 { System.out.println("Divid By Zero"); }
 catch(InputMismatchException e)
 {
 System.out.println("Bad character in the Input");
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println("Wrong Assignment in the Array");
 }
 System.out.println("Program successfully Executed..");
 }
} 


5

class NumberThread implements Runnable
{
Thread t;
NumberThread()
{
t = new Thread(this,"naturalnumber"); t.start();
}
public void run()
{
try
{
for(int n=1;n<=5;n++)
{
System.out.print("\nfactorial of " +n+ "="); Thread.sleep(1800);
}
}
catch(InterruptedException e)
{
System.out.println("number thread interrupted!");
}
System.out.println("\nexiting number thread");
}
}
class FactorialThread implements Runnable
{
Thread t; FactorialThread()
{
t = new Thread(this,"factorial"); t.start();
}
public void run()
{
int fact=1; try
{
for(int n=1;n<=5;n++)
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print(fact);
Thread.sleep(2000);
fact=1;
}
}
catch(InterruptedException e)
{
System.out.println("factorial interrupted !");
}
System.out.println("\nexiting factorial thread");
}
}
class MainThread
{
public static void main(String args[])
{
new NumberThread();
new FactorialThread();
}
}

6

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
