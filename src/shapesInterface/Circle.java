package shapesInterface;

public class Circle implements GeometricShape {
	private double radius;
	
	// Constructeur
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String getName(){
		return "Cercle";
	}
	
	@Override
	public double calculArea(){
		return Math.PI * radius * radius;
	}
}