
//This code deals about date formatting 
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
	private Calendar dob; // instance member
	private int age;
	private int month;
	private int day;

	public Date(Calendar dob) { // constructor
		super();
		this.dob = dob;
	}

	public void getAge(Calendar dob) {
		Calendar today = Calendar.getInstance();
		int curYear = today.get(Calendar.YEAR);
		int dobYear = dob.get(Calendar.YEAR);
		this.age = curYear - dobYear;

		int curMonth = today.get(Calendar.MONTH);
		int dobMonth = dob.get(Calendar.MONTH); // passing values
		this.month = dobMonth - curMonth;

		int curDay = today.get(Calendar.DAY_OF_MONTH);
		int dobDay = today.get(Calendar.DAY_OF_MONTH);
		this.day = curDay - dobDay;

		if (dobMonth > curMonth) {
			this.age--;
		}

		else if (dobMonth == curMonth) // condition loop
		{

			if (dobDay > curDay) {
				this.age--;
			}
		}
	}

	public int getAge() {
		return age;
	}

	public int getMonth() // getter and setter
	{
		return month;
	}

	public int getDay() {
		return day;
	}

}
