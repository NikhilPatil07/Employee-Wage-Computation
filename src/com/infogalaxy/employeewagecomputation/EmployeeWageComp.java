package com.infogalaxy.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {

		
	
		int attendance1;
		int employee_type = 0;
		int dailyWage1 = 0;
		int total_wage = 0;
		int total_working_hr = 0;
		int total_working_days = 1;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WORKING_DAYS = 20;
		
		System.out.println(" Welcome to Employee Wage Computation ");
		
		while(total_working_hr <= 100 && total_working_days <= 20 ) 
		{
		 System.out.println(" Day = "+total_working_days);	
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
								total_working_hr += PART_TIME_HR;
								break;
							
							case 1:
								System.out.println(" Employee is Full Time ");
								dailyWage1 = WAGE_PER_HR * FULL_TIME_HR;
								total_working_hr += FULL_TIME_HR;
								break;
							
							default:
								System.out.println(" Not a Employee ");
						}
						total_wage += dailyWage1;
						System.out.println(" Employee Wage = " + dailyWage1);
						break;
				
				default:
					System.out.println(" Invalid Number ");
	
			}
			System.out.println(" Total Working Hr = "+total_working_hr);
			System.out.println("...............");
			total_working_days++;
		}
		System.out.println(" Total Monthly Wage = "+total_wage);
	}
}