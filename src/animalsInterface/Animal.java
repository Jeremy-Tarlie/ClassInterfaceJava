package animalsInterface;

public class Animal implements Swim, Fly, Climb, Walk, Hibernate {
	private String name;
	
	// Constructeur
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage.");
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
	public void fly() {
		System.out.println(name + " vole.");
	}
	
	@Override
	public void hibernate() {
		System.out.println(name + " hiberne.");
	}
}