public class Week2Test{
	public static void main(String[] args){
		Date danielaDOB = new Date(25, 4, 1997);
		Date wesleyDOB = new Date(25, 2, 1991);
		Date jodiDOB = new Date(04, 9, 1996);
		Date paulineDOB = new Date(12, 9, 1964);

		Person daniela = new Person("Daniela", danielaDOB);
		Person wesley = new Person("Wesley", wesleyDOB);
		Person jodi = new Person("Jodi", jodiDOB);
		Person pauline = new Person("Pauline", paulineDOB);

		Lop listOfPeople = new Lop();
		
		listOfPeople.add(daniela);
		listOfPeople.add(wesley);
		listOfPeople.add(jodi);
		listOfPeople.add(pauline);

		System.out.println("-----------------");
		System.out.println("Test .find method");
		System.out.println("-----------------");
		System.out.println(listOfPeople.find("iela"));
		System.out.println(listOfPeople.find("ley"));
		System.out.println(listOfPeople.find("di"));
		System.out.println(listOfPeople.find("Pau"));

		listOfPeople.remove(jodi);
		listOfPeople.remove(pauline);

		System.out.println("-----------------");
		System.out.println("Test .print method");
		System.out.println("-----------------");
		listOfPeople.print();
		System.out.println("-----------------");
	}
}