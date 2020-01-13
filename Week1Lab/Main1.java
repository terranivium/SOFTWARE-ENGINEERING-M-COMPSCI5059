public class Main1{
	public static void main(String[] args){
		Person w1 = new Person("aaa", 1, 2, 1991); 
		w1.setType(2);

		Person w2 = new Person("bbb", 3, 4, 1993); 
		w2.setType(2);

		Person w3 = new Person("ccc", 5, 6, 1995); 
		w3.setType(2);

		Person b1 = new Person("ddd", 7, 8, 1997); 
		b1.setType(1);
		b1.setWorker(new Person[10]);

		Person b2 = new Person("eee", 9, 10, 1999); 
		b2.setType(1);
		b2.setWorker(new Person[10]);
		
		w1.setBoss(b1); 
		b1.getWorker()[b1.incrementNworkers()] = w1;
		
		w2.setBoss(b1); 
		b1.getWorker()[b1.incrementNworkers()] = w2;
		
		w3.setBoss(b1); 
		b1.getWorker()[b1.incrementNworkers()] = w3;
		
		b1.print(System.err); 
		System.err.print("\n");
		b2.print(System.err); 
		System.err.print("\n");
		w1.print(System.err); 
		System.err.print("\n");
		w2.print(System.err); 
		System.err.print("\n");
		w3.print(System.err); 
		System.err.print("\n");
	}
}

// Output
// ddd: born on 07/08/1997 bosses: aaa bbb ccc
// eee: born on 09/10/1999 bosses:
// aaa: born on 01/02/1991 is bossed by ddd
// bbb: born on 03/04/1993 is bossed by ddd
// ccc: born on 05/06/1995 is bossed by ddd
