package com.epam.list;

import java.util.*;
public class Custom {
	int b=0;
	int elements[]=new int[10000];
	ArrayList al=new ArrayList();
	public void add(int a) {
		al.add(a);
	}
	public void fetch(int a)
	{
		System.out.println(al.get(a));
	}
	public void remove(int a)
	{
		al.remove(a);
	}
	public void print()
	{
		System.out.println(al);
	}
}
