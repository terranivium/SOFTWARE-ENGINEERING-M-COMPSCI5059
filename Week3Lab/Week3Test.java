public class Week3Test{
	public static void main(String[] args){
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
		System.out.println("Test .find method, with all people");
		System.out.println("----------------------------------");
		System.out.println(listOfPeople.find("Daniela"));


		listOfPeople.remove(jodi);
		listOfPeople.remove(pauline);
		jodi.getBoss().removeWorker(jodi);
		pauline.getBoss().removeWorker(pauline);

		System.out.println("-----------------");
		System.out.println("Test .find method, removed jodi and pauline");
		System.out.println("-----------------");
		System.out.println(listOfPeople.find("iela"));

		System.out.println("-----------------");
		System.out.println("Test .print method, printing all people");
		System.out.println("-----------------");
		listOfPeople.print();
		System.out.println("-----------------");
	}
}