package salary_calculator_problem;

import java.util.Scanner;

public class Salary_calculator_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int days[]=new int[7];
		int counter;
		int extra_hour_money=15;
		int total_working_hours=0;
		int total_salary=0;
		for(counter=0;counter<7;counter++)
		{
			days[counter]=scanner.nextInt();
			if(counter!=0 && counter!=6)
			{
			total_working_hours+=days[counter];
			}
		}
		if(total_working_hours>40)
		{
			extra_hour_money=25;
		}
		for(counter=1;counter<6;counter++)
		{
			total_salary+=days[counter]*100;
			if(days[counter]>8)
			{
				total_salary+=extra_hour_money*(days[counter]-8);
			}
		}
		if(days[0]>0)
		{
			int sunday_bonus=(days[0]*100)/2;
			total_salary=total_salary+(days[0]*100)+sunday_bonus;
			if(days[0]>8)
			{
				total_salary+=total_salary+(days[0]-8)*25;
			}
			
		}
		if(days[6]>0)
		{
			int saturday_bonus=(days[6]*100)/4;
			total_salary=total_salary+(days[6]*100)+saturday_bonus;
			if(days[6]>8)
			{
				total_salary+=total_salary+(days[6]-8)*25;
			}
		}
		System.out.println(total_salary);

	}

}