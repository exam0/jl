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