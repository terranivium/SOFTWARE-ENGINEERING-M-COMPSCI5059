import office.Boss;
import office.Worker;
import people.Date;
import people.Lop;

public class Week4Test{
	public static void main(String[] args) throws CloneNotSupportedException {

		Date danielaDOB = new Date(25, 4, 1997);
		Date wesleyDOB = new Date(25, 2, 1991);
		Date jodiDOB = new Date(04, 9, 1996);
		Date paulineDOB = new Date(12, 9, 1964);

		Boss daniela = new Boss("Daniela", danielaDOB);
		Worker wesley = new Worker("Wesley", wesleyDOB, daniela);
		Worker jodi = new Worker("Jodi", jodiDOB, daniela);
		Worker pauline = new Worker("Pauline", paulineDOB, daniela);

		Lop listOfPeople = new Lop();
		
		listOfPeople.add(daniela);
		listOfPeople.add(wesley);
		listOfPeople.add(jodi);
		listOfPeople.add(pauline);

		System.out.println("----------------------------------");
		System.out.println("Test .find method with 'niela'");
		System.out.println(listOfPeople.find("niela"));

		listOfPeople.remove(jodi);
		listOfPeople.remove(pauline);

		System.out.println("-----------------");
		System.out.println("Test .find method with iela, removed jodi and pauline");
		System.out.println(listOfPeople.find("iela"));

		System.out.println("----------------------------------");
		System.out.println("Test .find method with 'odi' (should return null)");
		System.out.println(listOfPeople.find("odi"));

		Worker greg = new Worker("Greg", jodiDOB, daniela);
		Worker barry = new Worker("Barry", paulineDOB, daniela);

		listOfPeople.add(greg);
		listOfPeople.add(barry);

		System.out.println("-----------------");
		System.out.println("Test .print method, prints all people");
		listOfPeople.print();
		System.out.println("-----------------");

		// Regarding reasoning for not storing clones of Person in Lop -
		// referencing when removing the same person (doesn't seem to be an issue?)
		// We can not manipulate final fields in Object.clone() because final fields can only be changed 
		// through constructors. In our case, if we want every Person object to be unique by id, we will get the 
		// duplicate object if we use Object.clone() because Object.clone() will not call the constructor, and final id field 
		// can’t be modified from Person.clone().
	}
}