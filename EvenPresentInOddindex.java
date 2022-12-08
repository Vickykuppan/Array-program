public class EvenPresentInOddindex
{
public static void main(String args[])
{
int a[]={7,8,3,1,9};
for(int i=0;i<a.length;i++)
{
if(i%2==1)
{
if(a[i]%2==0)
{
System.out.println(a[i]);
}
}

}

}
}
