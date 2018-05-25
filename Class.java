package com.gpa;

public class Class {
	private String name;
	private int creditHours;
	private int points;
	private char letter;
	
	
	public Class()
	{
		name = "Unknown";
		creditHours = 0;
		letter = 'E';
		points = 0;
	}
	
	public Class(String className, int classHours, char grade)
	{
		name = new String(className);
		creditHours = classHours;
		letter = grade;
		
	}
	
	public int getPoints()
	{
		
		switch(letter)
		{
			case 'A':
				points = (4*creditHours);
				break;
				
			case 'B':
				points = (3*creditHours);
				break;
				
			case 'C':
				points = (2*creditHours);
				break;
			
			case 'D':
				points = (1*creditHours);
				break;
				
			case 'F':
				points = (0*creditHours);
				break;
				
			case 'a':
				points = (4*creditHours);
				break;
				
			case 'b':
				points = (3*creditHours);
				break;
				
			case 'c':
				points = (2*creditHours);
				break;
			
			case 'd':
				points = (1*creditHours);
				break;
				
			case 'f':
				points = (0*creditHours);
				break;
				
			default:
				System.err.print("Enter a valid Grade.");
		}
		
		return points;
	}
	
	public int getHours()
	{
		return creditHours;
	}
	
	public String toString()
	{
		return "    \n" + name + "\nGrade: " + letter + "\n" + creditHours + " Credit Hours" + 
			   "\n" + points + "Quality Points";
		
	}
	
	
	
	
	
}
