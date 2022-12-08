public class Merg
{
public static void main(String args[])
{
int a[]={7,3};
int b[]={1,4,9};
int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
c[i]=a[i];
}
for(int j=0;j<b.length;j++)
{
c[a.length+j]=b[j];
}
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}

