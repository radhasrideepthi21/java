import java.util.Scanner;
class PrimeNumber
{
public static void main(String args[])
{
int num;
Boolean isprime=true;
Scanner SC=new Scanner(System.in);
System.out.println("Enter the Number:");
num=SC.nextInt();
for(int i=2;i<num;i++)
{
if(num%i==0)
{
isprime=false;
break;
}
}
if(isprime==true)
{
System.out.println("The given number "+num+" is Prime number");
}
else
{
System.out.println("The given number "+num+" is not a prime number");
}
}
}