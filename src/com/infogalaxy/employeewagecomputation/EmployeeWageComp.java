package com.infogalaxy.employeewagecomputation;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComp 
{

	
	
		int attendance1;
		int employee_type;
		int dailyWage1 = 0;
		int total_wage = 0;
		int total_working_hr = 0;
		int total_working_days = 1;
		int total_working_hr1 = 0;
		int total_working_days1 = 1;
		int wage_per_hr;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		int working_days;
		int working_hr_month;
		
		public void employeeWageCalc()
		{
			System.out.println(" Welcome to Employee Wage Computation ");
		
			while(total_working_hr <= working_hr_month && total_working_days <= working_days ) 
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
								dailyWage1 = wage_per_hr * PART_TIME_HR;
								total_working_hr += PART_TIME_HR;
								break;
							
							case 1:
								System.out.println(" Employee is Full Time ");
								dailyWage1 = wage_per_hr * FULL_TIME_HR;
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
		
		public EmployeeWageComp(int wage_per_hr, int working_days,int working_hr_month)
		{
			this.wage_per_hr = wage_per_hr;
			this.working_days = working_days;
			this.working_hr_month = working_hr_month;
		}
		public static void main(String[] args)
		{
			EmployeeWageComp employeeWageComp = new EmployeeWageComp(13,15,50);
			employeeWageComp.employeeWageCalc();
			EmployeeWageComp employeeWageComp1 = new EmployeeWageComp(18, 30, 120);
			employeeWageComp1.employeeWageCalc();
		}
}
