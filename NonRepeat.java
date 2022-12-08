public class NonRepeat
{
public static void main(String args[])
{
int a[]={3,4,3,5,6,5};
for(int i=0;i<a.length;i++)
{
int counter=0;
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
counter=counter+1;
}
}
if(counter==1)
{
System.out.println(a[i]);
}
}
}
}

