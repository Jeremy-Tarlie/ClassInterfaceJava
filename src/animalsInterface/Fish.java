package animalsInterface;

public class Fish implements Swim {
	private String name;
	
	// Constructeur
	public Fish(String name) {
		this.name = name;
	}
	
	@Override
	public void swim() {
		String retour;
		if (name == "Nemo") {
			retour = " ne sait pas très bien nager.";
		} else {
			retour = " nage.";
		}
		
		System.out.println(name + retour);
	}
}