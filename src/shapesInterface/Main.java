package shapesInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cercle = new Circle(15);
		Rectangle rec = new Rectangle(10, 15);
		System.out.println(cercle.getName() + " a un p�rim�tre de " + cercle.calculArea());
		System.out.println(rec.getName() + " a un p�rim�tre de " + rec.calculArea());
	}

}