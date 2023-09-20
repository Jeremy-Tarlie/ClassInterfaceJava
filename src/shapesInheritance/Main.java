package shapesInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cercle = new Circle(15);
		Rectangle rec = new Rectangle(10, 15);
		System.out.println(cercle.getName() + " a une aire de " + cercle.calculArea());
		System.out.println(rec.getName() + " a une aire de " + rec.calculArea());
	}

}