import java.util.Scanner;
public class RemDupArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
int[] brr = new int[n];
System.out.println("enter array elements");
for(int i=0; i < n ;i++)
{
arr[i] = sc.nextInt();
}
System.out.println("\nGiven array elements:");
for(int i=0 ; i < n ;i++)
{
System.out.print(arr[i] + " ");
}
int newSize = 0;
for(int i=0;i< n;i++)
{
boolean isDup=false;
for(int j=0;j<newSize;j++)
{
if(arr[i] == brr[j])
{
isDup=true;
break;
}
}
if(!isDup)
{
brr[newSize]=arr[i];
newSize++;
}
}
System.out.println("\nGiven array element after removing duplication:");
for(int i=0;i< newSize;i++)
{
System.out.print(brr[i] + " ");
}
}
}