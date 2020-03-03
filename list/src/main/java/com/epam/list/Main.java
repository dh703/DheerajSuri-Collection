package com.epam.list;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Custom c=new Custom();
		int a[]=new int[100];
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Fetch\n2.Add\n3.remove\n4.print\n5.Exit");
			int ch=s.nextInt();
		switch(ch)
		{
		case 2:
			System.out.println("Enter how many elements?");
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
				c.add(a[i]);
			}
			break;
		case 3:
			System.out.println("Enter index to be removed");
			int n1=s.nextInt();
			c.remove(n1);
			break;
		case 1:
			System.out.println("Enter index:");
			int n2=s.nextInt();
			c.fetch(n2);
			break;
		case 4:
			c.print();
			break;
		case 5:
			System.exit(0);
		}
		}while(true);

	}

}
