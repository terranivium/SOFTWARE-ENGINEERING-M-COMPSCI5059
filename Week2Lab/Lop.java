import java.util.ArrayList;

public class Lop{

	private ArrayList<Person> listOfPeople = new ArrayList<Person>();

	public Lop(){
		this.listOfPeople = listOfPeople;
	}

	public void add(Person newPerson){
		this.listOfPeople.add(newPerson);
	}

	public void remove(Person newPerson){
		this.listOfPeople.remove(newPerson);
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