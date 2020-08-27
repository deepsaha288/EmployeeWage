public class EmployeeWage
{
	public static void main(String args[])
	{
		 // CONSTANTS
	   int isFullTime = 1;

		//COMPUTATION
		int empCheck = (int)( Math.random() * 10 ) % 2;
		System.out.println(empCheck);

			if ( empCheck == isFullTime )
				System.out.println( "Emplyee is Present" );
			else
				System.out.println( "Employee is Absent" ); 
	}
}
