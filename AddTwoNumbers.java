import java.util.Scanner;
class AddTwoNumbers
{
public static void main(String args[])
{
int i,j,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First no:");
i=sc.nextInt();
System.out.println("Enter Second no:");
j=sc.nextInt();
sum=i+j;
System.out.println("The sum of " + i +" and " + j + " is "+sum);
}
}