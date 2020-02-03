package people;

public class Date implements Cloneable{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}

	public int diffInYears(Date compareYear){
		int age = 0;
		if(compareYear.getMonth() < this.month){
			age =  compareYear.getYear() - this.year -1;
		} else if(compareYear.getMonth() > this.month){
			age =  compareYear.getYear() - this.year;
		} else if(compareYear.getMonth() == this.month){
			if(compareYear.getDay() < this.day){
				age = compareYear.getYear() - this.year -1;
			} else {
				age = compareYear.getYear() - this.year;
			}
		}
		return age;
	}

	public Date clone() throws CloneNotSupportedException {
		return (Date)super.clone();
	}

	public String print(){
		return String.format("%02d/%02d/%4d", this.day, this.month, this.year);
	}
}