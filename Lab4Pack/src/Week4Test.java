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

		// Not possible to .clone() a String.

		// Based on implementation of removing Worker from Lop at same time as 
		// removing them from a boss, not possible to restrict method.

		// Regarding reasoning for not storing clones of Person in Lop -
		// Becuase a new reference is created in .add(newPerson.clone())
		// It is not possible to .remove that person in the standard method
		// The clone would have to be created prior to addition to Lop
		// So that we have a variable name to reference it when using methods.
	}
}