package shapesInheritance;

public class Rectangle extends GeometricShape{
	private int largeur;
	private int longueur;
	
	// Constructeur
	public Rectangle(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	@Override
	public String getName(){
		return "Rectangle";
	}
	
	public int calculArea(){
		return longueur * largeur;
	}
}