package animalsInterface;

public class Monkey implements Fly, Climb, Walk, Swim {
	private String name;
	
	// Constructeur
	public Monkey(String name) {
		this.name = name;
	}
	
	@Override
	public void fly() {
		System.out.println(name + " vole.");
	}
	
	@Override
	public void walk() {
		System.out.println(name + " marche.");
	}
	
	@Override
	public void climb() {
		System.out.println(name + " grimpe.");
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage.");
	}
}