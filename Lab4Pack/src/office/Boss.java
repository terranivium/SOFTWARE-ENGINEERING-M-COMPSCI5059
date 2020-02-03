package office;

import people.Date;
import people.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Boss extends Person {
	
	private ArrayList<Worker> workers = new ArrayList<>();
	private Iterator<Worker> goThroughWorkers;
	private Worker currentWorker;

	public Boss(String name, Date dob) throws CloneNotSupportedException {
		super(name, dob.clone());
	}

	void addWorker(Worker toAdd){
		this.workers.add(toAdd);
		toAdd.setBoss(this);
	}

	public void removeWorker(Worker toRemove){
		this.workers.remove(toRemove);
		toRemove.setBoss(null);
	}

	public Worker nextWorker(){
		this.currentWorker = this.goThroughWorkers.next();
		return currentWorker;
	}

	public String listWorkers(){
		String workerNames = "";
		while(goThroughWorkers.hasNext()){
      		workerNames += "\n"+goThroughWorkers.next().getName();
    	}
    	return workerNames;
	}

	public void resetWorkers(){
		goThroughWorkers = workers.iterator();
	}

	public Boss cloneBoss() throws CloneNotSupportedException {
		return (Boss)super.clone();
	}

	public String print(){
		this.goThroughWorkers = this.workers.iterator();
		String boss=super.print();
		return boss+=String.format("\nWorkers: " + this.listWorkers());
	}
}