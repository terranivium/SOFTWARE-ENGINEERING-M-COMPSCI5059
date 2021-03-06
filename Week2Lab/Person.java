public class Person{

	private String name;
	private Date dob;

	public Person(String name, Date dob){
		this.name = name;
		this.dob = dob;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public int getAge(Date currentDate){
		return this.dob.diffInYears(currentDate);
	}

	public String print(){
		return String.format("%s: born on %s. Their age is %d.", this.name, this.dob.print(), this.getAge(new Date(27, 01, 2020)));
	}
}