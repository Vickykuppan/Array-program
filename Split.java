public class Split
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,7};
if(a.length%2!=0)
{
int x[]=new int[a.length/2];
int y[]=new int[(a.length/2)+1];
for(int i=0;i<x.length;i++)
{
x[i]=a[i];
System.out.println("X "+x[i]);
}
for(int i=0;i<y.length;i++)
{
y[i]=a[i+x.length];
System.out.println("Y "+y[i]);
}
}
else
{
int x[]=new int[a.length/2];
int y[]=new int[a.length/2];
for(int i=0;i<x.length;i++)
{
x[i]=a[i];
System.out.println("X "+x[i]);
}
for(int i=0;i<y.length;i++)
{
y[i]=a[i+x.length];
System.out.println("Y "+y[i]);
}
}
}
}
