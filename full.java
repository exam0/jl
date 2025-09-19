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


7

 Ex.No:7 OPERATIONS ON VECTOR 
import java.util.*; 
public class VectorTest 
{
public static void main(String args[]) 
{
Vector <String> v = new Vector <String>(4,2); 
 v.add("tiger"); 
 v.add("lion"); 
 v.add("dog"); 
 v.add("elephant"); 
System.out.println("size of the vector is : " +v.size()); 
System.out.println("vector element is : "+v.capacity()); 
System.out.println("vector elements is : " +v); 
Vector v1 = new Vector(1,1); 
v1.addElement("rat"); 
v1.addElement("cat"); 
v1.addElement("deer"); 
 v.addAll(v1); 
System.out.println("size after addition : "+v.size()); 
System.out.println("Capacity after addition : " +v.capacity()); 
 System.out.println("Elements are : "+v); 
if(v.contains("tiger")) 
{
System.out.println("tiger is present the index : " +v.indexOf("tiger")); 
}
else 
{
System.out.println("tiger is not present in index"); 
}
System.out.println("the firstelements in vector is : "+v.firstElement()); 
System.out.println("the last elements in vector is : " +v.lastElement()); 
}
}

8.


import java.io.*; import java.util.*; 
class ArrayListTest 
{
public static void main(String args[])throws Exception 
{
ArrayList a = newArrayList(); 
System.out.println("initial size of arraylist : "+a.size()); 
 a.add(new Integer(10)); 
a.add(new Integer(30)); 
 a.add(new Integer(50)); 
a.add(new Integer(70)); 
a.add(new Integer(80)); 
System.out.println("\n elements in the arraylist \n "+a); 
Object x[] = a.toArray(); 
int sum =0; 
for (int i =0;i<x.length;i++) 
sum+=((Integer)x[i]).intValue(); 
System.out.println("\n sum of arrylistelements : "+sum); 
 System.out.print("\nelementsinreverse order ["); 
for(int i =x.length-1;i>=0;i--) 
System.out.print(x[i]+" "); 
System.out.print("]"); 
}
}

9.

 import java.io.*; 
class SeqenceInputStream 
{
public static void main(String args[])throws Exception 
{
FileInputStream input1 =new FileInputStream("D:\\22PCS100\\First.txt"); 
FileInputStream input2=new FileInputStream("D:\\22PCS100\\Second.txt"); 
FileOutputStream output =new FileOutputStream("D:\\22PCS100\\merged.txt"); 
SequenceInputStreaminst = new SequenceInputStream(input1,input2); 
int j; while((j=inst.read())!=-1) 
{ 
 System.out.print((char)j); 
 output.write(j); 
 } 
System.out.println(“Files Merged..”);
inst.close(); 
input1.close(); 
 input2.close(); 
output.close(); 
}
}


10.

 import java.net.*; 
import java.io.*; 
public class TCPClient 
{ 
 public static void main(String arg[]) 
{ 
 try 
 { 
 Socket s= new Socket("localhost",9000); 
 System.out.println("Connected with server"); 
 OutputStream out= s.getOutputStream(); 
 PrintStream ps=new PrintStream(out,true); 
 ps.println("Hello M.Sc Students How are You ? "); 
 
 System.out.println("Your data has been sent successfully"); 
 ps.close(); 
 out.close(); 
 s.close(); 
} 
catch(Exception e) 
{ System.out.println(e); } 
} 
} 
import java.net.*; 
import java.io.*; 
public class TCPServer 
{ 
 public static void main(String args[]) 
{ 
 try 
{ 
 ServerSocket ss = new ServerSocket (9000); 
 System.out.println("Server is ready and listening port # 9000"); 
 Socket s= ss.accept() ; 
 System.out.println("Connected with client"); 
 InputStream in = s.getInputStream(); 
 BufferedReader bin = new BufferedReader( new InputStreamReader(in)); 
 System.out.println("Message from client :" + bin.readLine()); 
 s.close(); 
 ss.close(); 
} 
catch(Exception e) 
{ System.out.println(e); } 
} 
} 


11.

 import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class SwingControlDemo extends JFrame implements ActionListener 
{ 
 JLabel L1; 
 JLabel L2; 
 JPanel P1; 
 JButton b1,b2,b3; 
 Container con; 
 Font f; 
 public SwingControlDemo() 
 { 
 super("Java SWING Examples"); 
 setSize(400,400); 
 con = getContentPane(); 
 f = new Font("Verdana", Font.BOLD, 30); 
 setLayout(new GridLayout(3, 1)); 
 L1 = new JLabel("",JLabel.CENTER ); 
 L2 = new JLabel("",JLabel.CENTER); 
 L1.setFont(f); 
 L2.setForeground(Color.cyan); 
 L2.setFont(f); 
 L2.setSize(350,100); 
 P1 = new JPanel(); 
 P1.setLayout(new FlowLayout()); 
 add(L1); 
 add(L2); 
 add(P1); 
 L1.setText(""); 
 b1 = new JButton("RED"); 
 b2 = new JButton("BLUE"); 
 b3 = new JButton("GREEN"); 
 b1.setActionCommand("RED"); 
 b2.setActionCommand("BLUE"); 
 b3.setActionCommand("GREEN"); 
 b1.addActionListener(this); 
 b2.addActionListener(this); 
 b3.addActionListener(this); 
 P1.add(b1); 
 P1.add(b2); 
 P1.add(b3); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 setVisible(true); 
 } 
public void actionPerformed(ActionEvent e) 
 { 
 String command = e.getActionCommand(); 
 if( command.equals( "RED" )) 
 { 
 con.setBackground(Color.RED); 
 L2.setText("RED Button clicked."); 
 } 
 else if( command.equals( "BLUE" ) ) 
 { 
 con.setBackground(Color.BLUE); 
 L2.setText("BLUE Button clicked."); 
 } 
 else { 
 con.setBackground(Color.GREEN); 
 L2.setText("GREEN Button clicked."); 
 } 
 } 
 public static void main(String[] args) 
 { 
 SwingControlDemo obj = new SwingControlDemo(); 
 } 
} 
