import java.util.*;
class Fibonacci{
public static void main(String args[])
{
int n1=0,n2=1,n3,num;
Scanner scn=new Scanner(System.in);
num=scn.nextInt();
for(int i=0;i<=num;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}

}
}