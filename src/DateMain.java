
import java.util.Scanner;
import java.text.SimpleDateFormat;
 
import java.util.Calendar;

public class DateMain {

	public static void main(String[] args)throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date of birth in DD/MM/YYYY format");
		String input=scanner.nextLine();
		scanner.close();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Calendar dob=Calendar.getInstance();
		dob.setTime(sdf.parse(input));
		Date Age=new Date(dob);
		
		System.out.println("Age of the person is:"+Age.getAge()+" yr"+Age.getMonth()+" months"+Age.getDay()+" days old");
		
	}
}
