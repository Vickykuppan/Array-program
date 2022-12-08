public class Repeat
{
public static void main(String args[])
{
int a[]={2,4,2,6,8};
abc:for(int i=0;i<=a.length;i++)
for(int j=i+1;j<=a.length;j++)
if (a[i]==a[j])
{
System.out.println(a[j]);
break abc;
}
}
}
