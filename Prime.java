public class Prime
{
public static void main(String args[])
{
int a[]={3,4,2,6,8,17, 13, 21, 9};
//outer for loop to supply array elements ----> a[i]
for(int i = 1; i <a.length; i++)
{
// Prime number code starts here 
boolean flag=false;
for(int j=2;j<=a[i]/2;j++)
{
if(a[i]%j==0)
{
flag=true;
}
}
if(flag)
{
System.out.println(a[i]+" Is not prime number");
}
else
{
System.out.println(a[i]+" Is prime number");
}
// Prime number code ends here 
}
//outer for loop ends here 
}
}
