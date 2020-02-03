package office;

import people.Date;
import people.Person;

public class Worker extends Person {

	private Boss boss;

	public Worker(String name, Date dob, Boss workerBoss) throws CloneNotSupportedException {
		super(name, dob.clone());
		this.boss = workerBoss;
		this.boss.addWorker(this);
	}

	public void setBoss(Boss newBoss){
		this.boss = newBoss;
	}

	public Boss getBoss(){
		return this.boss;
	}

	public Worker cloneWorker() throws CloneNotSupportedException {
		return (Worker)super.clone();
	}

	public String print(){
		String worker=super.print();
		return worker+String.format("\nBoss: %s", this.boss.getName());
	}
}