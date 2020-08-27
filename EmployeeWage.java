public class EmployeeWage
{
                //CONSTANTS
	       public static final int PartTime=1;
	       public static final int FullTime=2;
	       public static final int Absent=0;
	       public static final int EmpRatePerHrs=20;

	     public void calculatedEmployeeWage()
	        {
		//VARIABLES
		int employeeHour=0;
		int empWage=0;

	 	//COMPUTATION
		int empCheck = (int)( Math.random() * 10 ) % 3;

		              switch(empCheck){
			case PartTime
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

		        empWage=employeeHour * empRatePerHrs;
		    System.out.println("Employee Wage:" + empWage);
	}

	 //main method
    public static void main(String args[]){

    //create object of class
    EmployeeWage employee = new EmployeeWage();

    //method call
    employee.calculatedEmployeeWage();
    }
}
