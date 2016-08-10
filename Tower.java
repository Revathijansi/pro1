import java.util.*;
public class Tower
{
public static int n;
public static Stack<Integer>[] t=new Stack[5];
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
t[1]=new Stack();
t[2]=new Stack();
t[3]=new Stack();
System.out.println("enter number of disk);
int num=scan.nextInt();
n=num;
to(num);
}
public static void to(int n)
{
for(int i=n;i>0;i--)
{
t[1].push(i);
display();
mov(n,1,2,3);
}
public static void mov(int n,int a,int b,int c)
{
if(n>0)
{
mov(n-1,a,c,b);
int i=t[a].pop();
int i=t[a].pop();
t[c].push(i);
display();
mov(n-1,b,a,c);
}
}
public static void display()
{
System.out.println("------------");
for(int i=n-1;i>=0;i--)
{
String d1="",d2="",d3="";
try
{
d1=String.valueOf(t[1].get(i));
}
catch(Exception e)
}
system.out.println(+d1);
}
}
