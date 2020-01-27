public class Worker extends Person{

	private Boss boss;

	public Worker(String name, Date dob, Boss workerBoss){
		super(name, dob);
		this.boss = workerBoss;
		this.boss.addWorker(this);
	}

	public void setBoss(Boss newBoss){
		this.boss = newBoss;
	}

	public Boss getBoss(){
		return this.boss;
	}

	public String print(){
		String worker=super.print();
		return worker+String.format("\nBoss: %s", this.boss.getName());
	}
}