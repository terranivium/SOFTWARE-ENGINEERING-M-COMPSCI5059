package people;

public class Person implements Cloneable{

	private String name;
	private Date dob;

	public Person(String name, Date dob) throws CloneNotSupportedException {
		this.name = name;
		this.dob = dob.clone();
	}

	public String getName(){
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	private int getAge(Date currentDate){
		return this.dob.diffInYears(currentDate);
	}

	public Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}

	public String print(){
		System.out.println("----------------------------------");
		return String.format("%s: DOB %s. AGE %d.", this.name, this.dob.print(), this.getAge(new Date(27, 01, 2020)));
	}
}