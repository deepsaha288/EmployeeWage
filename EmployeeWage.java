public class EmployeeWage
{

        //CONSTANTS
	final int Absent=0;
        final int PartTime=1;
	final int FullTime=2;
	final int empRatePerHrs=20;
	final int MaxWoringHrs=100;
	final int MaxDays=20;

	        public void calculatedEmployeeWage()
         	{
		//VARIABLES
		int totalEmployeeHour=0;
		int employeeHour=0;
		int totalSalary=0;
		int totalWorkingDays=0;

		while(totalWorkingDays<MaxDays && totalEmployeeHour<MaxWoringHrs)
		{
			totalWorkingDays++;

	 		//COMPUTATION
			int empCheck = (int)( Math.random() * 10 ) % 3;

			         switch(empCheck){
				case PartTime:
					employeeHour=4;
					break;

				case FullTime:
					employeeHour=8;
					break;

				case Absent:
            	                        employeeHour = 0;
                                        break;

				 default:
				       System.out.println("invalid choice");
			}

		//calculated total employee hour
		totalEmployeeHour=(totalEmployeeHour + employeeHour);

		//calculated total Salary
		totalSalary=(empRatePerHrs * totalEmployeeHour);
		}

		System.out.println("total salary of employee:" +totalSalary);
	}

	//main method
   public static void main(String args[]){

   //create object of class
   EmployeeWage employee = new EmployeeWage();

   //method call
   employee.calculatedEmployeeWage();
  }
}
