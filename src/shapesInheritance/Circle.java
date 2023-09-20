package shapesInheritance;

public class Circle extends GeometricShape {
	private double radius;
	
	// Constructeur
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String getName(){
		return "Cercle";
	}
	
	public double calculArea(){
		return Math.PI * radius * radius;
	}
}