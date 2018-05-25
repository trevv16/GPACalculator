package com.gpa;

import java.util.Scanner;

public class Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String className;
		String loop = "Unknown";
		int cummulativePoints;
		int cummulativeHours;
		int classes;
		int classHours;
		int totalPoints = 0;
		int totalHours = 0;
		double GPA =  0.000;
		double cummulativeGPA;
		char grade;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to the GPA Calculator Program!");
		
		System.out.println("How many classes do you have?: ");
		classes = input.nextInt();
		
		Class[] sched = new Class[classes];
		
		System.out.println("Enter Info for your classes: ");
		
		for(int i =0; i< classes; i++)
		{
			System.out.println();
			System.out.println();
			System.out.println("Class Name: ");
			className = input.next();
			
			System.out.println("Credit Hours: ");
			classHours = input.nextInt();
			
			System.out.println("Grade: ");
			grade = input.next().charAt(0);
			
			sched[i] = new Class(className, classHours, grade);
		}
		
		//Outputs Classes
		
		for(int c = 0; c< sched.length; c++)
		{
			sched[c].toString();
		}
		
		//Calculates GPA
		for(int g = 0; g < sched.length; g++)
		{
			totalHours += sched[g].getHours();
			totalPoints += sched[g].getPoints();
		}
		
		GPA = (totalPoints/totalHours);
		
		for (int c = 0; c < sched.length; c++)
		{
			System.out.println(sched[c].toString());
			System.out.println();
			System.out.println();
		}
		
		System.out.println("Total Hours: " + totalHours);
		System.out.println("Total Quality Points: " + totalPoints);
		
		
		System.out.println("GPA: " + GPA);
		
		System.out.println("Would you like to calculate your cummulative GPA?: ");
		loop = input.nextLine();
		
		switch(loop)
		{
			case "Y":
				System.out.println("Enter your cummulative quality points: ");
				cummulativePoints = input.nextInt();
				totalPoints += cummulativePoints;
				
				System.out.println("Enter your cummulative quality points: ");
				cummulativeHours = input.nextInt();
				totalHours += cummulativeHours;
				
				cummulativeGPA = (totalPoints/totalHours) / 1.00;
				System.out.println();
				
				System.out.println("Semester GPA:	"  + GPA);
				System.out.println("Semester GPA:	"  + GPA);
				System.out.println("Total Points:	"  + totalPoints);
				System.out.println("Total Hours:	"  + totalHours);
				System.out.println();
				break;
				
			case "y":
				System.out.println("Enter your cummulative quality points: ");
				cummulativePoints = input.nextInt();
				totalPoints += cummulativePoints;
				
				System.out.println("Enter your cummulative quality points: ");
				cummulativeHours = input.nextInt();
				totalHours += cummulativeHours;
				
				cummulativeGPA = (totalPoints/totalHours) / 1.00;
				System.out.println();
				
				System.out.println("Semester GPA:	"  + GPA);
				System.out.println("Semester GPA:	"  + GPA);
				System.out.println("Total Points:	"  + totalPoints);
				System.out.println("Total Hours:	"  + totalHours);
				System.out.println();
				break;
				
			case "N":
				break;
				
			case "n":
				break;
		}
		
		System.out.println();
		
		System.out.println("Goodbye.");
		
	}

	
	
	
}
