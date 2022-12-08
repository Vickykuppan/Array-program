public class Understanding1
{
public static void main(String args[])
{
int a[]={1,5,3,4,5};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if (a[i]==a[j])
{
a[j]=0;
}
}
//To print element
//for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
}
}
