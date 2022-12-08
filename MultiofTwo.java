public class MultipleofTwo
{
public static void main(String args[])
{
int a[]={1,5,4,2,3,10};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]*a[j]==20)
{
System.out.println(a[i]+" "+a[j]);
}
}
}
}
}
