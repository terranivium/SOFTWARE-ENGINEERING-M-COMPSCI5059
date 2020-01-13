import java.io.PrintStream;

public class Person{

	private String name;
	private int dob_d, dob_m, dob_y; // date of birth
	private int type; // 1 = Boss, 2 = Worker
	private Person boss;
	private Person[] worker;
	private int nworkers;

	public Person(String name, int day, int month, int year){
		this.name = name;
		this.dob_d = day;
		this.dob_m = month;
		this.dob_y = year;
		this.boss = null;
		this.worker = null;
		this.nworkers = 0;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public int getType(){
		return this.type;
	}

	public void setType(int newType){
		this.type = newType;
	}

	public int getNworkers(){
		return this.nworkers;
	}

	public void setNworkers(int newNworkers){
		this.nworkers = newNworkers;
	}

	public Person getBoss(){
		return this.boss;
	}

	public void setBoss(Person newBoss){
		this.boss = newBoss;
	}

	public Person[] getWorker(){
		return this.worker;
	}

	public void setWorker(Person[] newWorker){
		this.worker = newWorker;
	}

	public int incrementNworkers(){
		return this.nworkers++;
	}

	public void print(PrintStream ps){
		ps.print(String.format("%s: born on %02d%02d%4d", this.name, this.dob_d, this.dob_m, this.dob_y));
	if (this.type == 1){
		ps.print(" bosses: ");
		for (int i = 0; i < this.nworkers; i++){
			ps.print(this.worker[i].getName() + " ");
		}
	} else {
		ps.print(" is bossed by " + boss.getName());
		}
	}
}