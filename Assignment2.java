package com.pk;

import java.util.*;

class Student{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
	
}

public class Assignment2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] hs=new Student[5];
		
		System.out.println("Enter Data:");
		Scanner sc=new Scanner(System.in);
		
		
		for (int i=0;i<5;i++) {
			hs[i]=new Student(sc.nextInt(),sc.next());
		}
				
		int i=0;
		do{
			System.out.println(hs[i]);
			i++;
		}while(i<hs.length);
		
	}
}
