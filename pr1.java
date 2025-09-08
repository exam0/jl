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