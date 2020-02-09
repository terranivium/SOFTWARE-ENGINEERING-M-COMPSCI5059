package office;

import people.Date;
import people.Person;

public class Worker extends Person {

	private Boss boss;

	public Worker(String name, Date dob, Boss workerBoss) throws CloneNotSupportedException {
		// The Worker constructor must take a Boss objects as argument, to make
		//sure that the first invariant is correct when the object is created
		super(name, dob.clone());
		// The Worker object can then remember the Boss itself, taking care of
		// invariant 2.
		this.boss = workerBoss;
		// The Worker constructor must send a message to the Boss so that it
		// can take the appropriate action
		this.boss.addWorker(this);
		// This is a method of class Boss, which is called by code in the
		// Worker constructor. Let us call it add_worker.
	}

	public void destroy() {
		// The Worker destructor (or destroy method) should now send a restricted
		// message to its Boss telling it that the Worker object is about to be
		// destroyed.
		this.boss.subWorker(this);
	}

	public Worker cloneWorker() throws CloneNotSupportedException {
		return (Worker)super.clone();
	}

	public void newBoss(Boss newBoss) {
		this.boss.subWorker(this);
		newBoss.addWorker(this);
		this.boss = newBoss;
	}

	public String print(){
		String worker = super.print();
		return worker + String.format("\nBoss: %s", this.boss.getName());
	}
}