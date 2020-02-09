package office;

import people.Date;
import people.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Boss extends Person {
	
	private ArrayList<Worker> workers = new ArrayList<>();
	private Iterator<Worker> goThroughWorkers;

	public Boss(String name, Date dob) throws CloneNotSupportedException {
		super(name, dob.clone());
	}

	void addWorker(Worker toAdd){
		this.workers.add(toAdd);
	}

	void subWorker(Worker toRemove){
		this.workers.remove(toRemove);
	}

	private Worker nextWorker(){
		return this.goThroughWorkers.next();
	}

	private String listWorkers(){
		StringBuilder workerNames = new StringBuilder();
		while(goThroughWorkers.hasNext()){
      		workerNames.append("\n").append(goThroughWorkers.next().getName());
    	}
    	return workerNames.toString();
	}

	public void resetWorkers(){
		goThroughWorkers = workers.iterator();
	}

	public Boss cloneBoss() throws CloneNotSupportedException {
		return (Boss)super.clone();
	}

	public String print(){
		this.goThroughWorkers = this.workers.iterator();
		String boss = super.print();
		return boss += "\nWorkers: " + this.listWorkers();
	}
}