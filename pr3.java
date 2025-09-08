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