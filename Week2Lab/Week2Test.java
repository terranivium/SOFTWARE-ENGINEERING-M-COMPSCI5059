public class Week2Test{
	public static void main(String[] args){
		Date danielaDOB = new Date(25, 04, 1997);
		Date wesleyDOB = new Date(25, 02, 1991);

		Person daniela = new Person("Daniela", danielaDOB);
		Person wesley = new Person("Wesley", wesleyDOB);

		Lop listOfPeople = new Lop();
		listOfPeople.add(daniela);
		listOfPeople.add(wesley);
		System.out.println(listOfPeople.find("Daniela"));
	}
}