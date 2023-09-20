package shapesInterface;

public class Rectangle implements GeometricShape{
	private double largeur;
	private double longueur;
	
	// Constructeur
	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	@Override
	public String getName(){
		return "Rectangle";
	}
	
	@Override
	public double calculArea(){
		return longueur * largeur;
	}
}