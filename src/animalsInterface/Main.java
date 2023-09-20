package animalsInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal duck = new Animal("Canard");
		duck.swim();
		duck.fly();
		duck.walk();
		
		System.out.println();
		
		Animal bear = new Animal("Ours");
		bear.swim();
		bear.hibernate();
		bear.climb();
		bear.walk();
		
		System.out.println();
		
		
		Bird pigeon = new Bird ("Pigeon");
		pigeon.fly();
		pigeon.walk();
		
		System.out.println();

		Fish sardine = new Fish ("Sardine");
		sardine.swim();
		
		System.out.println();

		Fish clown = new Fish ("Nemo");
		clown.swim();
		
		System.out.println();
		
		Monkey gorilla = new Monkey("Gorille");
		gorilla.swim();
		gorilla.climb();
		gorilla.walk();
		
		
	}

}