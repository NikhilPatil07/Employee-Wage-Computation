package com.infogalaxy.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {

		
	
		int attendance1;
		int employee_type = 0;
		int dailyWage1 = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS = 20;
		
		System.out.println(" Welcome to Employee Wage Computation ");
		
		for(int i = 1; i <= WORKING_DAYS; i++)
		{
		 System.out.println(" Day = "+i);	
		 Random random = new Random();
		 attendance1 = random.nextInt(9) % 2;
		
			switch(attendance1)
			{
				case 0:
					System.out.println(" Employee is Absent ");
				break;
				
				case 1:
					System.out.println(" Employee is Present ");
					employee_type = random.nextInt(9) % 2;
						switch(employee_type)
						{
							case 0:
								System.out.println("Enployee is Part Time ");
								dailyWage1 = WAGE_PER_HR * PART_TIME_HR;
							break;
							
							case 1:
								System.out.println(" Employee is Full Time ");
								dailyWage1 = WAGE_PER_HR * FULL_TIME_HR;
							break;
							
							default:
								System.out.println(" Not a Employee ");
						}
						System.out.println(" Employee Wage = " + dailyWage1);
				break;
				
				default:
					System.out.println(" Invalid Number ");
	
			}
		}
	}
}