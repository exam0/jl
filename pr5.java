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