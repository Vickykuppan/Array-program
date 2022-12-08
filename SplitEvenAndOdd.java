public class SplitEvenAndOdd
{
public static void main(String args[])
{
int a[]={7,5,4,6,2,3};
int evencounter=0;
int oddcounter=0;
//To print odd /even element
for(int i=0;i<=a.length;i++)
{
if(a[i]%2==0)
{
evencounter=evencounter+1;
}
else
{
oddcounter=oddcounter+1;
}
}
int x[]=new int[evencounter];
int y[]=new int[oddcounter];
int c=0;
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
x[c++]=a[i];
System.out.println(x[i]);
}
else
{
y[c++]=a[i];
System.out.println(y[i]);
}
}
}
}


