package com.infogalaxy.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {

		
		int attendance = 0;
		int dailyWage = 0;
		int attendance1;
		int employee_type = 0;
		int dailyWage1;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		
		
		System.out.println(" Welcome to Employee Wage Computation ");
		
		Random random = new Random();
		attendance1 = random.nextInt(9) % 2;
		
		if(attendance1 == 0)
		{
			System.out.println(" Employee is Absent ");
			
		}
		else
		{
			System.out.println(" Employee is Present ");
			dailyWage1 = WAGE_PER_HR * FULL_DAY_HR;
			System.out.println(" Employee Wage = "+ dailyWage1);
			
			if(employee_type == 0)
			{
				System.out.println(" Employee is Part Time ");
				dailyWage1 = WAGE_PER_HR * PART_TIME_HR;
			}
			else
			{
				System.out.println(" Enployee is Full Time ");
				dailyWage1 = WAGE_PER_HR * FULL_TIME_HR;
				
			}
			System.out.println(" Employee Wage = "+dailyWage1);
		}
	}

}
