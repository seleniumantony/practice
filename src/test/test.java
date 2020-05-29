package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int Length=s.nextInt();
int v=Length+0;
int a[]=new int[v];
for(int i=0;i<v;i++)
{
	a[i]=s.nextInt();
}

for(int j=0;j<v;j++)
{
	System.out.println(a[j]);
}
	}

}
