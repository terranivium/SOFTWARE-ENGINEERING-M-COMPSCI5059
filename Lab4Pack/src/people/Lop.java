package people;

import office.Worker;

import java.util.ArrayList;

public class Lop{

	private ArrayList<Person> listOfPeople = new ArrayList<>();

	public Lop(){
	}

	public ArrayList<Person> getLop(){
		return this.listOfPeople;
	}

	public void add(Person newPerson) {
		this.listOfPeople.add(newPerson);
	}

	public void remove(Person remPerson){
		this.listOfPeople.remove(remPerson);
	}

	public void remove(Worker remWorker){
		this.listOfPeople.remove(remWorker);
		remWorker.destroy();
	}

	public String find(String search){
		for(Person curVal : listOfPeople){
			if(curVal.getName().contains(search)){
				return curVal.print();
			}
		}
		return null;
	}

	public void print(){
		for(Person printVal : listOfPeople){
			System.out.print(printVal.print() + "\n");
		}
	}
}