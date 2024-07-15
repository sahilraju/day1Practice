package day1_practiceExercise.question5;

public class Date {
	
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		
		if(validateDate(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
	}
	
	public boolean validateDate(int day, int month, int year) {
		
		if((day>=1 && day<=30) && (month>=1 && month<=12) && (year>=2000 && year<=2024)) {
			return true;
		}
		
		return false; 
	}

	@Override
	public String toString() {
		return day+"/"+month+"/"+year; 
	}
	
	

}
 