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